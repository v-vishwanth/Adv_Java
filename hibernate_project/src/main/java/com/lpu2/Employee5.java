package com.lpu2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee5 {

	@Id
	private int id;
	private String name;
	private double sal;
	private long phone;
	
	public Employee5() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
