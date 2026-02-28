package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "collage")
public class Collage {
	@Value("100")
	private int id;
	private String name;
	private String location;
	private String department;
	
	Collage(@Value("XYZ")String name,@Value("HYD")String location){
		this.name = name;
		this.location = location;
	}
	
	@Value("CSE")
	public void setDepartment(String department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getDepartment() {
		return department;
	}
	
	
}
