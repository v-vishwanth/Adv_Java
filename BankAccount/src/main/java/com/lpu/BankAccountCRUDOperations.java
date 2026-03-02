package com.lpu;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;


public class BankAccountCRUDOperations implements BankAccountCRUD{
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;
	
	static {
		emf = Persistence.createEntityManagerFactory("dev");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	@Override
	public void saveBank(Bank bank) {
		tx.begin();
		em.persist(bank);
		tx.commit();
	}
	
	@Override
	public void updateBank(int id,String bankName, String bankLocation) {
		Bank bank = em.find(Bank.class, id);
		
		tx.begin();
		bank.setName(bankName);
		bank.setLocation(bankLocation);
		tx.commit();
	}
	
	@Override
	public Bank findBankByID(int id) {
		return em.find(Bank.class, id);
	}
	
	@Override
	public Bank findBankByName(String name) {
		Query query = em.createQuery("SELECT b FROM Bank b WHERE b.name = :name");
		query.setParameter("name", name);
		
		return (Bank)query.getSingleResult();
	}
	
	@Override
	public void assignAccountToBank(int bankId, Account newAccount) {
		Query query = em.createQuery("SELECT b FROM Bank b WHERE b.id = :id");
		query.setParameter("id", bankId);
		
		Bank bank = (Bank)query.getSingleResult();   
		
		tx.begin();
		em.persist(newAccount);
		newAccount.setBank(bank);
		bank.getAccounts().add(newAccount);
		tx.commit();
		
	}
	
	@Override
	public void assignAccountsToBank(int bankId, List<Account> accounts) {
		Query query = em.createQuery("SELECT b FROM Bank b WHERE b.id = :id");
		query.setParameter("id", bankId);
		
		Bank bank = (Bank)query.getSingleResult();
		
		tx.begin();
		for(Account ac : accounts) {
			em.persist(ac);
			ac.setBank(bank);
			bank.getAccounts().add(ac);
		}
		tx.commit();
	}
	
	@Override
	public List<Account> findAllAccountsInBank(int bankId){
		return em.find(Bank.class, bankId).getAccounts();
		
	}
}
