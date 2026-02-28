package com.lpu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.entity.Student;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Component

public class StudentDao {
	
	@Autowired	
	private EntityManagerFactory emf;
	
	@PostConstruct
	public void init() {
		System.out.println("it is ready to use");
	}
	
	

    //private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

    public Student saveStudent(Student s) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        tr.begin();
        em.persist(s);
        tr.commit();

        em.close();
        return s;
    }
    public void updateStudentMarks(int id, double newMarks) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        Student s = em.find(Student.class, id);  

        if (s != null) {
            tr.begin();
            s.setMarks(newMarks);
            em.merge(s);
            tr.commit();
            em.close();
            System.out.println("Student marks updated");
            return;
        }

        em.close();
        System.out.println("Student not exist");
    }

    public Student findStudentById(int id) {
        EntityManager em = emf.createEntityManager();
        Student s = em.find(Student.class, id);
        em.close();
        return s;
    }

    public void deleteStudentById(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        Student s = em.find(Student.class, id);

        if (s != null) {
            tr.begin();
            em.remove(s);
            tr.commit();
            em.close();
            System.out.println("Student deleted");
            return;
        }

        em.close();
        System.out.println("Student not exist");
    }
    
    @PreDestroy
    public void distory() {
    	System.out.println("DB connection is close");
    }
}
