package com.onetoone;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityTransaction;

public class Driver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		//1st Adhar Object
//		Adhar a1 = new Adhar();
//		a1.setId(101);
//		a1.setLocation("Varanasi");
//		
		//1st Person Object
//		Person p1 = new Person();
//		p1.setId(1);
//		p1.setName("Abhishek");
//		p1.setAdhar(a1);   //Assigning Adhar to a Person
//		
//		tx.begin();
//		em.persist(p1);
//		em.persist(a1);
//		tx.commit();
		
		//2nd Adhar Object
//		Adhar a2 = new Adhar();
//		a2.setId(102);
//		a2.setLocation("Kaimur");
//		
		//2nd Person Object
//		Person p2 = new Person();
//		p2.setId(2);;
//		p2.setName("Prakash");
//		p2.setAdhar(a2);   //Assigning Adhar to a Person
//		
//		tx.begin();
//		em.persist(p2);
//		em.persist(a2);
//		tx.commit();
		
		
		//3rd Adhar Object
		Adhar a3 = new Adhar();
		a3.setId(103);
		a3.setLocation("Rajasthan");
		
		//3rd Person Object
		Person p3 = new Person();
		p3.setId(3);;
		p3.setName("Shivraj");
		p3.setAdhar(a3);   //Assigning Adhar to a Person
		
		tx.begin();
		em.persist(p3);
//		em.persist(a3);
		tx.commit();
	}
}
