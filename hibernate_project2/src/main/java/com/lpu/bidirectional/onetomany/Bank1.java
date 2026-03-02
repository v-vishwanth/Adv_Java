package com.lpu.bidirectional.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Bank1 {
	@Id
	private int id;
	private String name;
	private String location;
	
	@OneToMany(mappedBy = "bank")
	private List<Account1> accounts;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Account1> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account1> accounts) {
		this.accounts = accounts;
	}
	
	
}
