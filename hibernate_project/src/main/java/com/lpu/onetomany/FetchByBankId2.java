package com.lpu.onetomany;

import jakarta.persistence.*;
import java.util.*;

public class FetchByBankId2 {
	public static void fetching(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Bank b = em.find(Bank.class, id);
		
		System.out.println("Bank_Id -> " + b.getId() + ", Bank_Name -> " + b.getName() + ", Bank_Location -> " + b.getLocation());
//		List<Account> list1 = b.getAccount();
		for(Account a : b.getAccount()) {
			System.out.println("Account_Id -> " + a.getId() + ", Account_Name -> " + a.getName() + ", Account_Balance -> " + a.getBalance());
		}
//		System.out.println();
	}
}