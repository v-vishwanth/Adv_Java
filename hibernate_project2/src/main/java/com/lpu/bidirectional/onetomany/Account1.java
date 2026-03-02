package com.lpu.bidirectional.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Account1 {

	@Id
	private int id;
	private String name;
	private double balance;
	
	@ManyToOne
	@JoinColumn
	private Bank1 bank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank1 getBank() {
		return bank;
	}

	public void setBank(Bank1 bank) {
		this.bank = bank;
	}
	
	
}
