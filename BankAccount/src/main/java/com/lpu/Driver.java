package com.lpu;

import java.util.Arrays;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
//		Bank b1 = new Bank();
//		b1.setId(10);
//		b1.setName("SBI");
//		b1.setLocation("Bangalore");
//		
//		Bank b2 = new Bank();
//		b2.setId(20);
//		b2.setName("HDFC");
//		b2.setLocation("Hyderabad");
//		
		BankAccountCRUDOperations baco = new BankAccountCRUDOperations();
		
		//INSERT
//		baco.saveBank(b1);
//		baco.saveBank(b2);
		
		//UPDATE
//		baco.updateBank(10, "ICICI", "Mumbai");
		
		Bank bank = baco.findBankByID(20);
		System.out.println("Bank ID :- " + bank.getId());
		System.out.println("Bank Name : - " + bank.getName());
		System.out.println("Bank Location :- " + bank.getLocation());
		
		System.out.println();
		
		Bank bank1 = baco.findBankByName("ICICI");
		System.out.println("Bank ID :- " + bank1.getId());
		System.out.println("Bank Name : - " + bank1.getName());
		System.out.println("Bank Location :- " + bank1.getLocation());
		
		
		System.out.println();
		
		
		
//		Account ac1 = new Account();
//		ac1.setId(101);
//		ac1.setName("Pushpendar");
//		ac1.setBalance(8765);
//		
//		Account ac2 = new Account();
//		ac2.setId(102);
//		ac2.setName("Kamlesh");
//		ac2.setBalance(9857);
		
//		Account ac3 = new Account();
//		ac3.setId(103);
//		ac3.setName("Rajesh");
//		ac3.setBalance(2467);
		
//		baco.assignAccountToBank(10,ac1);
//		baco.assignAccountToBank(20,ac2);
//		baco.assignAccountToBank(20,ac3);
		
		
		
//		Account ac4 = new Account();
//		ac4.setId(104);
//		ac4.setName("Patil");
//		ac4.setBalance(8765);
//		
//		Account ac5 = new Account();
//		ac5.setId(105);
//		ac5.setName("Gaitonde");
//		ac5.setBalance(9857);
//		
//		Account ac6 = new Account();
//		ac6.setId(106);
//		ac6.setName("Bhai");
//		ac6.setBalance(2467);
//
//		baco.assignAccountsToBank(10, new ArrayList<>(Arrays.asList(ac4,ac5,ac6)));
		
		//FETCHING
		for(Account ac : baco.findAllAccountsInBank(10)) {
			System.out.println("Account ID :- " + ac.getId());
			System.out.println("Account Name : - " + ac.getName());
			System.out.println("Account Balance :- " + ac.getBalance());
			System.out.println();
		}
		
	}
}
