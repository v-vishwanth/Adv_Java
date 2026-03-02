package com.lpu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person1 {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Adhar1 adhar;

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

	public Adhar1 getAdhar() {
		return adhar;
	}

	public void setAdhar(Adhar1 adhar) {
		this.adhar = adhar;
	}
	
	public Person1() {
		
	}

	public Person1(int id, String name, Adhar1 adhar) {
		this.id = id;
		this.name = name;
		this.adhar = adhar;
	}
}
