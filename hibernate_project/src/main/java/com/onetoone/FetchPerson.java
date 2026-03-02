package com.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class FetchPerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
//		Person person = em.find(Person.class, 1);
//		System.out.println("Person_Id -> " + person.getId());
//		System.out.println("Person_Name -> " + person.getName());
//		
//		Adhar adhar = person.getAdhar();
//		System.out.println("Adhar_Id -> " + adhar.getId());
//		System.out.println("Adhar_Location -> " + adhar.getLocation());
//		
//		System.out.println();
//		System.out.println();
		
		Query query = em.createQuery("SELECT p FROM Person p");
		List<Person> list = query.getResultList();
		
		for(Person person : list) {
			System.out.println("Person_Id -> " + person.getId());
			System.out.println("Person_Name -> " + person.getName());
			
			Adhar adhar = person.getAdhar();
			System.out.println("Adhar_Id -> " + adhar.getId());
			System.out.println("Adhar_Location -> " + adhar.getLocation());	
			
			System.out.println();
		}
		
		
		
	}
}
