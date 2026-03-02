package com.lpu.firstlevelcache;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
//		Student s1 = new Student();
//		s1.setStudentId(1);
//		s1.setName("Abhishek");
//		s1.setPhone(123456l);
//		
//		Student s2 = new Student();
//		s2.setStudentId(2);
//		s2.setName("Kamla");
//		s2.setPhone(913246l);
//		
//		Student s3 = new Student();
//		s3.setStudentId(3);
//		s3.setName("Lambu");
//		s3.setPhone(123456l);
//		
//		Student s4 = new Student();
//		s4.setStudentId(4);
//		s4.setName("Himalayan");
//		s4.setPhone(55555l);
//		
//		Student s5 = new Student();
//		s5.setStudentId(5);
//		s5.setName("Paritosh");
//		s5.setPhone(98765l);	
		
//		tx.begin();
////		em.persist(s1);
////		em.persist(s2);
////		em.persist(s3);
////		em.persist(s4);
////		em.persist(s5);
//		tx.commit();
		
		//ONLY ONE QUERY IS WRITTEN BY HIBERNATE BECAUSE IT IS TAKING THE OBJECT FROM CACHE
		Student s1 = em.find(Student.class, 1);
//		Student s2 = em.find(Student.class, 1);
		System.out.println(s1);
//		System.out.println(s2);
	
		
		//FOR EACH EntityManager THERE WILL BE CACHE -> SO THERE ARE TWO EntityManager SO IT WILL CREATE TWO CACHE AND IF YOU SEARCH FOR SAME ID SO TWO QUERY WILL BE SHOWN TO CONSOLE BECAUSE THEY BOTH HIT DATABASE 
		EntityManager em2 = emf.createEntityManager();
		Student s3 = em2.find(Student.class, 1);
//		Student s4 = em2.find(Student.class, 1);
		System.out.println(s3);
//		System.out.println(s4);
	}
}
