package com.lpu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lpu.calculator;

public class testCalculator {
	
	static calculator c = null;
	@BeforeAll
	public static void CreateObject() {
		System.out.println("Unit test Started");
		c = new calculator();
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(5, c.add(2, 3));
	}
	
	@Test
	public void testSub() {
		Assertions.assertEquals(0, c.sub(4, 3));
	}
	
	@Test
	public void testMulti() {
		Assertions.assertEquals(6, c.mul(3, 2));
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Close unit testing");
	}
}
