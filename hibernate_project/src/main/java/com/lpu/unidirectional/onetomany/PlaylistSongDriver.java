package com.lpu.unidirectional.onetomany;

import java.util.Arrays;

import jakarta.persistence.*;

public class PlaylistSongDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		
		Song s1 = new Song();
		s1.setId(100l);
		s1.setName("Peaches");
		s1.setDuration(3);
		
		
		Song s2 = new Song();
		s2.setId(110l);
		s2.setName("Intentions");
		s2.setDuration(4);
		
		Playlist p1 = new Playlist();
		p1.setId(10l);
		p1.setTitle("English");
		p1.setSongs(Arrays.asList(s1,s2));
		
		tx.begin();
		em.persist(p1);
		em.persist(s1);
		em.persist(s2);
		tx.commit();
	}
}
