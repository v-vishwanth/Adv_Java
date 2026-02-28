package com.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
@Id
	int studentid;
	String location;
	public int getStudentid() {
		return studentid;
	}
	public Aadhar() {
		
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
