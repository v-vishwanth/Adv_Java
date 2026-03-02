package com.lpu.bidirectional.onetoone;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AdharPersonDriver {
	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		
//		Person person1 = new Person();
//		person1.setId(10);
//		person1.setName("ramu");
//		
//		Adhar adhar1 = new Adhar();
//		adhar1.setId(101);
//		adhar1.setLocation("Bihar");
//		
//		person1.setAdhar(adhar1);  //give adhar to person
//		adhar1.setPerson(person1);  //give person to adhar
//		
//		tx.begin();
//		em.persist(adhar1);
//		em.persist(person1);
//		tx.commit();
		
		//FetchType
		FetchAdharByPerson.fetchingAdhar(10);
		
	}
}
