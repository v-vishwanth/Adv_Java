package com.lpu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
@Component
public class StudentDao {
	@Autowired
	private EntityManagerFactory emf;
	
	public Student saveStudent(Student s) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(s);
		et.commit();
		em.close();
		
		return s;
	}
	
	public Student findStudentById(int id) {
		EntityManager em=emf.createEntityManager();
		//EntityTransaction et = em.getTransaction();
		Student s=em.find(Student.class, id);
		em.close();
		return s;
	}
	
	public void updateStudentMarks(int id, double newMarks) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s=em.find(Student.class, id);
		s.setMarks(newMarks);
		et.begin();
		em.merge(s);
		et.commit();
		em.close();
	}
	
	public void deleteStudentById(int id) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = em.find(Student.class, id);
		et.begin();
		em.remove(s);
		et.commit();
		em.close();
	}
}