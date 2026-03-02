package com.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		//We can remove the owner like Person is owner but can the non Owner like Adhar is non Owner so if we have to remove non Owner so we have to first make Adhar of that particular person as null the remove it 
//		Person p = em.find(Person.class, 3);
//		Adhar a = p.getAdhar();
//		p.setAdhar(null);
//		tx.begin();
//		em.remove(a);
//		tx.commit();
		
		
//		Person p = em.find(Person.class, 3);
////		Adhar a = p.getAdhar();
////		p.setAdhar(null);
//		tx.begin();
//		em.remove(p);
//		tx.commit();
		
		
		Person p = em.find(Person.class, 2);
		Adhar a = p.getAdhar();
		//p.setAdhar(null);
		
		tx.begin();
		em.remove(p);
		em.remove(a);
		tx.commit();
	}
}
