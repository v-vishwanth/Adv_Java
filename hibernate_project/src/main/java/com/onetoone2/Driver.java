package com.onetoone2;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityTransaction;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
//		Engine e1 = new Engine();
//		e1.setId(100);
//		e1.setCc("1600cc");
//		
//		Car c1 = new Car();
//		c1.setId(10);
//		c1.setBrand("Toyota");
//		c1.setE(e1);
//		
//		tx.begin();
//		em.persist(c1);
//		em.persist(e1);
//		tx.commit();
		
		
		
//		Engine e2 = new Engine();
//		e2.setId(110);
//		e2.setCc("1900cc");
//		
//		Car c2 = new Car();
//		c2.setId(20);
//		c2.setBrand("Ford");
//		c2.setE(e2);
//		
//		tx.begin();
//		em.persist(c2);
//		em.persist(e2);
//		tx.commit();
		
		
		//UPDATE
//		UpdateCar.updatingCar(20, "Mahindra", "1700cc");
		
		//SAVE
//		Engine e3 = new Engine();
//		e3.setId(130);
//		e3.setCc("2100cc");
//		
//		Car c3 = new Car();
//		c3.setId(30);
//		c3.setBrand("Tata");
//		c3.setE(e3);
//		
//		tx.begin();
//		em.persist(c3);
//		em.persist(e3);
//		tx.commit();
		
		//DELETE
//		DeleteCar.deletingCar(30);
		
		//FIND
		FindCar.findingCar(10);
		
		//FINDALL
		FindAllCar.findingAllCar();
		
		//FINDCARBYBRAND
		FindCarByBrand.findingCar("Mahindra");
	}
}
