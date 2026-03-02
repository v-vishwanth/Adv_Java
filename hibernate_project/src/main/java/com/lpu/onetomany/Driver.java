package com.lpu.onetomany;

import jakarta.persistence.EntityManagerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
//		Account ac1 = new Account();
//		ac1.setId(100);
//		ac1.setName("Abhishek");
//		ac1.setBalance(4500);
//		
//		Account ac2 = new Account();
//		ac2.setId(110);
//		ac2.setName("Krishna");
//		ac2.setBalance(6000);
//		
//		List<Account> list = new ArrayList<>(Arrays.asList(ac1,ac2));
//		
//		Bank b1 = new Bank();
//		b1.setId(10);
//		b1.setName("PNB");
//		b1.setLocation("Punjab");
//		b1.setAccount(list);
//		
//		tx.begin();
//		em.persist(b1);
////		em.persist(ac1);
////		em.persist(ac2);
//		tx.commit();
//		
//		
//		Account ac1 = new Account();
//		ac1.setId(200);
//		ac1.setName("Prakash");
//		ac1.setBalance(8900);
//		
//		Account ac2 = new Account();
//		ac2.setId(210);
//		ac2.setName("Satyam");
//		ac2.setBalance(2300);
//		
//		List<Account> list = new ArrayList<>(Arrays.asList(ac1,ac2));
//		
//		Bank b2 = new Bank();
//		b2.setId(20);
//		b2.setName("SBI");
//		b2.setLocation("Bihar");
//		b2.setAccount(list);
//		
//		tx.begin();
//		em.persist(b2);
//		em.persist(ac1);
//		em.persist(ac2);
//		tx.commit();
		
		//FETCHING
		FetchAccount.fetching();
	
		//FETCHING BY ID
		FetchByBankId.fetching(20);
		
		//FETCHING BY ID
		FetchByBankId2.fetching(10);
	}
}
