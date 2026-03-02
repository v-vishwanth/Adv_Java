package com.lpu.onetomany;

import jakarta.persistence.*;
import java.util.*;

public class FetchAccount {
	public static void fetching() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT b FROM Bank b");
		List<Bank> list = query.getResultList();
		
		for(Bank b : list) {
			System.out.println("Bank_Id -> " + b.getId() + ", Bank_Name -> " + b.getName() + ", Bank_Location -> " + b.getLocation());
			
			System.out.println("Accounts in this banks are :- ");
			List<Account> list1 = b.getAccount();
			for(Account a : list1) {
				System.out.println("Account_Id -> " + a.getId() + ", Account_Name -> " + a.getName() + ", Account_Balance -> " + a.getBalance());
			}
			System.out.println();
		}
	}
}
