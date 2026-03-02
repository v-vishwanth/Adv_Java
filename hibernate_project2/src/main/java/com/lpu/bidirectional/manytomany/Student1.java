package com.lpu.bidirectional.manytomany;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Student1 {
	@Id
	private int id;
	private String name;
	private String phoneno;
	
	@ManyToMany
	private List<Subject1> subjects;

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

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public List<Subject1> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject1> subjects) {
		this.subjects = subjects;
	}
	
	
}
