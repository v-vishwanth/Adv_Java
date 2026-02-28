package com.lpu.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
@Component
public class studentDAO {
	@Autowired
	EntityManagerFactory emf;
	
	public void saveStudent(student s) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction ef = em.getTransaction();
		ef.begin();
		em.persist(s);
		ef.commit();
	}
}
