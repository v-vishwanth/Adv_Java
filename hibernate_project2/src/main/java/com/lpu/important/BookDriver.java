package com.lpu.important;

import jakarta.persistence.*;

public class BookDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Book book = new Book();
//		book.setId(10);
		book.setAuthor("Abhishek");
		book.setName("An Overthinker");
		
		tx.begin();
		em.persist(book);
		tx.commit();
	}
}
