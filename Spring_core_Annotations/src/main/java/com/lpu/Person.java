package com.lpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("100")
	private int id;
	@Value("Xyz")
	private String name;
	@Autowired
	private Aadhaar card;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Aadhaar getCard() {
		return card;
	}
	
	
}
