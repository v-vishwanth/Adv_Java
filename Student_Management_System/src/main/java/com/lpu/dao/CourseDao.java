package com.lpu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
@Component
public class CourseDao {
	@Autowired
    private EntityManagerFactory emf;

    // Save Course
    public Course saveCourse(Course c) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(c);
        et.commit();
        em.close();

        return c;
    }

    // Find Course By Id
    public Course findCourseById(int id) {
        EntityManager em = emf.createEntityManager();
        Course c = em.find(Course.class, id);
        em.close();
        return c;
    }

    // Update Course Trainer
    public void updateCourseTrainer(int id, String newTrainer) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Course c = em.find(Course.class, id);
        if (c != null) {
            c.setTrainer(newTrainer);
            et.begin();
            em.merge(c);
            et.commit();
        }

        em.close();
    }

    // Delete Course By Id
    public void deleteCourseById(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Course c = em.find(Course.class, id);
        if (c != null) {
            et.begin();
            em.remove(c);
            et.commit();
        }

        em.close();
    }
}