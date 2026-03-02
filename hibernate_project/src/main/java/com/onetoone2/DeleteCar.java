package com.onetoone2;


import jakarta.persistence.*;

public class DeleteCar {
	public static void deletingCar(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Car c = em.find(Car.class, id);
		Engine e = c.getE();
		c.setE(null);
		
		em.remove(e);
		em.remove(c);
		tx.commit();
	}
}
