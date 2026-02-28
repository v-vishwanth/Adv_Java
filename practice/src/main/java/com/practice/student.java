package com.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class student {
@Id
	int studentIid;
	String name;
	long phone;
	public int getStudentIid() {
		return studentIid;
	}
	public void setStudentIid(int studentIid) {
		this.studentIid = studentIid;
	}
	public Aadhar getAdha() {
		return adha;
	}
	public void setAdha(Aadhar adha) {
		this.adha = adha;
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
	@Override
	public String toString() {
		return "student [studentIid=" + studentIid + ", name=" + name + ", phone=" + phone + "]";
	}
	public student() {
		
	}
	@OneToOne
	Aadhar adha;
	
	
}
