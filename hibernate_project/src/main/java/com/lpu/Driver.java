package com.lpu;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityTransaction;

import com.lpu.Student;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		System.out.println(emf);
		EntityManager em = emf.createEntityManager();  //for CRUD methods
		
		EntityTransaction tx = em.getTransaction();  //for Handling Transactions
		
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setName("Abhishek");
		s1.setPhone(123456789l);
//		
		tx.begin();
		em.persist(s1);
		tx.commit();
		
//		Student s2 = new Student();
//		s2.setStudentId(2);
//		s2.setName("Krishna");
//		s2.setPhone(987654321l);//
//		
//		tx.begin();
//		em.persist(s2);
//		tx.commit();
		
		Student student1 = em.find(Student.class, 1);
		Student student2 = em.find(Student.class, 2);
//
//		System.out.println(student1);
//		System.out.println(student2);
//		
//		tx.begin();
//		System.out.println("Student 2 has been removed");
//		em.remove(student2);
//		tx.commit();
		
		
//		Student student1 = em.find(Student.class, 1);
//		tx.begin();
//		System.out.println("Student 1 has been removed");
//		em.remove(student1);
//		tx.commit();
		
//		tx.begin();
//		Student s4 = new Student();
//		s4.setStudentId(4);
//		s4.setName("Priya");
//		s4.setPhone(9876543213L);
//		em.persist(s4);
//		tx.commit();
		
//		tx.begin();
//		Student s1 = new Student();
//		s1.setStudentId(1);
//		s1.setName("Amit");
//		s1.setPhone(9876543210L);
//		em.persist(s1);
//		tx.commit();
	}
}
