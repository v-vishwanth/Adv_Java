package com.lpu.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Stud {
	@Id
	private int id;
	private String name;
	private long phone;
	
	@ManyToMany
	private List<Subject> subject;

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public Stud() {

	}

	public Stud(int id, String name, long phone, List<Subject> subject) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.subject = subject;
	}	
	
	
}
