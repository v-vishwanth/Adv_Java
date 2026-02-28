package com.lpu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.entity.Course;
import com.lpu.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


@Component
public class Coursedao {
	@Autowired
	private    EntityManagerFactory emf;

    //private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

     public Course saveCourse(Course c) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        tr.begin();
        em.persist(c);
        tr.commit();

        em.close();
        return c;
    }

     public Course findCourseById(int courseId) {
        EntityManager em = emf.createEntityManager();
        Course course = em.find(Course.class, courseId);
        em.close();
        return course;
    }

     public void updateCourse(int id, String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        Course cc = em.find(Course.class, id);

        if (cc != null) {
            tr.begin();
            cc.setCourseName(name);
            em.merge(cc);
            tr.commit();
        } else {
            System.out.println("Course not found!");
        }

        em.close();
    }

     public List<Student> findAllStudent(int courseId) {
        EntityManager em = emf.createEntityManager();

        Course course = em.find(Course.class, courseId);

        List<Student> students = null;
        if (course != null) {
            students = course.getStudents();
            students.size();  
        }

        em.close();
        return students;
    }

     public void giveCourseToStudent(int studentId, int courseId) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        Student ss = em.find(Student.class, studentId);
        Course cc = em.find(Course.class, courseId);

        if (ss != null && cc != null) {
            tr.begin();

            ss.getCourses().add(cc);
            cc.getStudents().add(ss);

            em.merge(ss);
            em.merge(cc);

            tr.commit();
        } else {
            System.out.println("Student or Course not found!");
        }

        em.close();
    }
}
