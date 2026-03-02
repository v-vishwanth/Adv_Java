package com.onetoone2;

import jakarta.persistence.*;

public class UpdateCar {
	public static void updatingCar(int id,String brand,String cc) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Car c = em.find(Car.class, id);
		c.setBrand(brand);
		c.getE().setCc(cc);
		em.merge(c);
		tx.commit();
	}
}
