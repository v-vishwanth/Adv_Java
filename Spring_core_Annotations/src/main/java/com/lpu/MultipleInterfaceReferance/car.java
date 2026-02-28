package com.lpu.MultipleInterfaceReferance;

import org.springframework.stereotype.Component;

@Component
public class car implements vehicle {
	public void status() {
		System.out.println("Car Started");
	}
}
