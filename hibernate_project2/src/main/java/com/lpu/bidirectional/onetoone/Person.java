package com.lpu.bidirectional.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Adhar adhar;

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

	public Adhar getAdhar() {
		return adhar;
	}

	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	
	public Person() {
		
	}

	public Person(int id, String name, Adhar adhar) {
		this.id = id;
		this.name = name;
		this.adhar = adhar;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adhar=" + adhar + "]";
	}
	
	
}
