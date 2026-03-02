package com.lpu.unidirectional.onetomany;

import java.util.*;
import jakarta.persistence.*;

public class Driver{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		ResearchPaper rp1 = new ResearchPaper();
		rp1.setTitle("AI");
		rp1.setPublicationYear(2024);	
		
		ResearchPaper rp2 = new ResearchPaper();
		rp2.setTitle("ML");
		rp2.setPublicationYear(2025);
		
		List<ResearchPaper> researchPaper = new ArrayList<>(Arrays.asList(rp1,rp2));
		
		University uni = new University();
		uni.setName("LPU");
		uni.setResearchPaper(researchPaper);
		
		tx.begin();
		em.persist(uni);
		tx.commit();
	}
}
