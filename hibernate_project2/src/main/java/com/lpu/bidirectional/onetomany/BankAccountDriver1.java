package com.lpu.bidirectional.onetomany;

import jakarta.persistence.EntityManagerFactory;

import java.util.ArrayList;
import java.util.Arrays;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BankAccountDriver1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Bank1 bank1 = new Bank1();
		bank1.setId(101);
		bank1.setName("SBI");
		
		Account1 account1 = new Account1();
		account1.setId(10);
		account1.setName("Riya");
		
		Account1 account2 = new Account1();
		account2.setId(11);
		account2.setName("Ramu");
		
		bank1.setAccounts(new ArrayList<>(Arrays.asList(account1,account2)));
		
		account1.setBank(bank1);
		account2.setBank(bank1);
		
		tx.begin();
		em.persist(bank1);
		em.persist(account1);
		em.persist(account2);
		tx.commit();
	}
}
