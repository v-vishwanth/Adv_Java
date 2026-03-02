package com.lpu.secondlevelcache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em1 = emf.createEntityManager();
		EntityTransaction tx = em1.getTransaction();
		
//		Person p1 = new Person(1,"Abhishek");
//		Person p2 = new Person(2,"Prakash");
//		
//		tx.begin();
//		em1.persist(p1);
//		em1.persist(p2);
//		tx.commit();
		
		//em1
		Person p1 = em1.find(Person.class, 1);
		
		
		//Here, Level 2 cache is enabled so for EntityManager2nd or 2nd Session cache Person object is not there in 2nd Session cache so it will go to Level 2 cache and find that Person object because it is stored there because of EntityManager1, so no DB hit occur only we get one query which is hitting DB in console.
		//em2
		EntityManager em2 = emf.createEntityManager();
		Person p2 = em2.find(Person.class,1);
	}
}
