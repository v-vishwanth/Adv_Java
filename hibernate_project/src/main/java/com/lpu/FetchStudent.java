package com.lpu;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
//import jakarta.persistence.EntityTransaction;   Not required for fetching
import jakarta.persistence.Query;

import java.util.List;

public class FetchStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		//Fetching 1 Student at a time
		Student s1 = em.find(Student.class, 6);
		System.out.println(s1);
		
		
//		//Fetching All Student at once
//		List<Student> list =
//			    em.createNativeQuery("SELECT * FROM Student", Student.class)
//			      .getResultList();
//
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
		//Fetching All Student at once using HQL/
		Query query = em.createQuery("SELECT s FROM Student s");
		List<Student> list1  = query.getResultList();
		
		for(Student s : list1) {
			System.out.println(s);
		}
		
		//Fetching Single Result
		Query query1 = em.createQuery("SELECT s FROM Student s WHERE s.id=1");
		Student student = (Student)query1.getSingleResult();
		System.out.println(student);
	}
}
