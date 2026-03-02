package com.lpu.manytomany;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Subject sub1 = new Subject(101,"java","ravi");
		Subject sub2 = new Subject(102,"sql","Vaishnav");
		
		List<Subject> subject = new ArrayList<>(Arrays.asList(sub1,sub2));
		
		Stud s1 = new Stud(10,"Abhishek",987654,subject);
		Stud s2 = new Stud(11,"Krishna",456789,subject);
		
		tx.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(sub1);
		em.persist(sub2);
		tx.commit();

	}
}
