package com.lpu.bidirectional.manytomany;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UpdateSubjectTrainer {
	public static void updating( String OLDNAME, String NEWNAME) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Query query = em.createQuery("UPDATE Subject1 s1 SET s1.trainer= :newName WHERE s1.trainer= :oldName");
		query.setParameter("newName", NEWNAME);
		query.setParameter("oldName", OLDNAME);

		query.executeUpdate();
		tx.commit();
	}
}
