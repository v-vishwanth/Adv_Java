package com.lpu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lpu.Calculator;

public class TestCalculator1 {
	static Calculator calc = null;
	
	@BeforeAll
	public static void CreateObject() {
		System.out.println("unit test started");
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int res = 2+2;
		Assertions.assertEquals(4, res);
	}
	
	@Test
	public void testCalAdd() {		
		int res = calc.add(5, 6);
		
		Assertions.assertEquals(11,res);
		System.out.println("Addition");
	}
	
	@Test
	public void testCalSub() {
		int res = calc.sub(8,6);
		
		Assertions.assertEquals(2, res);
		System.out.println("Subtraction");
	}
	
	@Test
	public void testCalMul() {
		int res = calc.mul(5, 5);
		
		Assertions.assertEquals(25, res);
		System.out.println("Multiplication");
	}
	
	@Test
	public void testCalDiv() {
		int res = calc.div(10,5);
		
		Assertions.assertEquals(2,res);
		System.out.println("Division");
	}
	
	@Test
	public void testCalMod() {
		int res = calc.mod(10,5);
		
		Assertions.assertEquals(0,0);
		System.out.println("Modulous");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Connection Closed");
	}
}
