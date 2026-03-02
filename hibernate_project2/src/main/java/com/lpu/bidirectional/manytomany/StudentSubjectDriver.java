package com.lpu.bidirectional.manytomany;

import java.util.Arrays;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentSubjectDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Student student1 = new Student();
		student1.setId(10);
		student1.setName("ramu");
		
		Student student2 = new Student();
		student2.setId(11);
		student2.setName("raju");
		
		Subject subject1 = new Subject();
		subject1.setId(101);
		subject1.setName("java");
		
		Subject subject2 = new Subject();
		subject2.setId(102);
		subject2.setName("sql");
		
		student1.setSubjects(Arrays.asList(subject1,subject2));
		student2.setSubjects(Arrays.asList(subject1,subject2));
		
		subject1.setStudents(Arrays.asList(student1,student2));
		subject2.setStudents(Arrays.asList(student1,student2));
		
		tx.begin();
		em.persist(student1);
		em.persist(student2);
		em.persist(subject1);
		em.persist(subject2);
		tx.commit();
	}
}
