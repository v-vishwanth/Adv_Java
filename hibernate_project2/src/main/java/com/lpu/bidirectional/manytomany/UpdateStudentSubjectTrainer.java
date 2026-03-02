package com.lpu.bidirectional.manytomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateStudentSubjectTrainer {
	public static void updating(int id, String name, String name1) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Student1 s = em.find(Student1.class, id);
		
		for(Subject1 s1 : s.getSubjects()) {
			if(s1.getTrainer().equals(name)) {
				tx.begin();
				s1.setTrainer(name1);
				em.merge(s1);
//				em.merge(s);
				tx.commit();
			}
		}
	}
}
