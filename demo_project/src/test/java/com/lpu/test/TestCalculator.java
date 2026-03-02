package com.lpu.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lpu.Calculator;

public class TestCalculator {
	Calculator calc = new Calculator();
	
	@Test
	public void testAdd() {
		int res = 2+2;
		Assertions.assertEquals(4, res);
	}
	
	@Test
	public void testCalAdd() {		
		int res = calc.add(5, 6);
		
		Assertions.assertEquals(11,res);
	}
	
	@Test
	public void testCalSub() {
		int res = calc.sub(8,6);
		
		Assertions.assertEquals(2, res);
	}
	
	@Test
	public void testCalMul() {
		int res = calc.mul(5, 5);
		
		Assertions.assertEquals(25, res);
	}
	
	@Test
	public void testCalDiv() {
		int res = calc.div(10,5);
		
		Assertions.assertEquals(2,res);
	}
	
	@Test
	public void testCalMod() {
		int res = calc.mod(10,5);
		
		Assertions.assertEquals(0,0);
	}
}
