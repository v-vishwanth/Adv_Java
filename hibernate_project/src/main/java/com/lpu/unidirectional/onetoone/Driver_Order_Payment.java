package com.lpu.unidirectional.onetoone;

import jakarta.persistence.*;

public class Driver_Order_Payment {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Payment payment1 = new Payment();
		payment1.setPaymentMode("UPI");
		payment1.setStatus("Pending");
		
		Payment payment2 = new Payment();
		payment2.setPaymentMode("Net Banking");
		payment2.setStatus("Successfull");
		
		Order order1 = new Order();
		order1.setAmount(4500);
		order1.setPayment(payment1);
		
		Order order2 = new Order();
		order2.setAmount(6000);
		order2.setPayment(payment2);
		
		tx.begin();
		em.persist(order1);
		em.persist(order2);
		em.persist(payment1);
		em.persist(payment2);
		tx.commit();
	}
}
