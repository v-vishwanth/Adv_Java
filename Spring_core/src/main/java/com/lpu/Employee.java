package com.lpu;

public class Employee {
	private int id;
	private String name;
	private Laptop laptop;
	
	public int getId() {
		return id;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
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
	public Employee(int id,String name,Laptop laptop) {
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}
	public void work() {
		System.out.println("working");
	}
	
}
