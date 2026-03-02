package com.lpu.bidirectional.manytomany;

import java.util.Arrays;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentSubjectDriver1 {
	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		
//		Student1 student1 = new Student1();
//		student1.setId(10);
//		student1.setName("ramu");
//		
//		Student1 student2 = new Student1();
//		student2.setId(11);
//		student2.setName("raju");
//		
//		Subject1 subject1 = new Subject1();
//		subject1.setId(101);
//		subject1.setName("java");
//		
//		Subject1 subject2 = new Subject1();
//		subject2.setId(102);
//		subject2.setName("sql");
//		
//		student1.setSubjects(Arrays.asList(subject1,subject2));
//		student2.setSubjects(Arrays.asList(subject1,subject2));
//		
//		subject1.setStudents(Arrays.asList(student1,student2));
//		subject2.setStudents(Arrays.asList(student1,student2));
//		
//		tx.begin();
//		em.persist(student1);
//		em.persist(student2);
//		em.persist(subject1);
//		em.persist(subject2);
//		tx.commit();
		
		//FETCHING
//		FetchStudentAndSubject.fetching();
		
		//FETCHING-BY-ID
		FetchStudentAndSubjectById.fetching(11);
		
		//UPDATING
//		UpdateStudentSubjectTrainer.updating(10,"Ravi","Abhishek");
		
		//UPDATING-USING-HQL/JPQL 
		UpdateSubjectTrainer.updating("Vaishnav", "Krishna");
	}
}
