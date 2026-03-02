package com.lpu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar1 {

	@Id
	private int id;
	private String location;
	
	@OneToOne
	private Person1 person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Person1 getPerson() {
		return person;
	}

	public void setPerson(Person1 person) {
		this.person = person;
	}

	public Adhar1() {

	}

	public Adhar1(int id, String location, Person1 person) {
		this.id = id;
		this.location = location;
		this.person = person;
	}
}
