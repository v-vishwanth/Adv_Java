package com.lpu;

import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class SaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();  //For CRUD Operations
		EntityTransaction tx = em.getTransaction();  //For Transaction
		
		tx.begin();
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setName("Amit");
		s1.setPhone(9876543210L);
		em.persist(s1);

		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setName("Rohit");
		s2.setPhone(9876543211L);
		em.persist(s2);

		Student s3 = new Student();
		s3.setStudentId(3);
		s3.setName("Sneha");
		s3.setPhone(9876543212L);
		em.persist(s3);

		Student s4 = new Student();
		s4.setStudentId(4);
		s4.setName("Priya");
		s4.setPhone(9876543213L);
		em.persist(s4);

		Student s5 = new Student();
		s5.setStudentId(5);
		s5.setName("Rahul");
		s5.setPhone(9876543214L);
		em.persist(s5);

		Student s6 = new Student();
		s6.setStudentId(6);
		s6.setName("Neha");
		s6.setPhone(9876543215L);
		em.persist(s6);
		
		Student s7 = new Student();
		s7.setStudentId(7);
		s7.setName("Vikas");
		s7.setPhone(9876543216L);
		em.persist(s7);
		
		Student s8 = new Student();
		s8.setStudentId(8);
		s8.setName("Anjali");
		s8.setPhone(9876543217L);
		em.persist(s8);
		
		Student s9 = new Student();
		s9.setStudentId(9);
		s9.setName("Suresh");
		s9.setPhone(9876543218L);
		em.persist(s9);
		
		Student s10 = new Student();
		s10.setStudentId(10);
		s10.setName("Kavita");
		s10.setPhone(9876543219L);
		em.persist(s10);
		
		tx.commit();
		System.out.println("10 records are inserted successfully");
		em.close();
		emf.close();
	}
}
