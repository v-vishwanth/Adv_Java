package com.lpu.bidirectional.onetoone;

import java.net.Socket;

import jakarta.persistence.*;

public class FetchAdharByPerson {
	public static void fetchingAdhar(int personId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, personId);
		System.out.println(p);
		
//		Adhar a = p.getAdhar();
//		System.out.println(a);
	}
}
