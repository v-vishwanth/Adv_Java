package com.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdatePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Person p = em.find(Person.class, 2);
		
		p.setName("Hariom");
		
		Adhar a = p.getAdhar();
		a.setLocation("Bihar");
		
		tx.begin();
		em.merge(p);
		tx.commit();
	}
}
