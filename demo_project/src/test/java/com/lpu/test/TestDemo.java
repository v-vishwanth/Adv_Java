package com.lpu.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.lpu.Palindrome;

public class TestDemo {
	@Test
	public void m1() {
		System.out.println("m1 Test");
	}
	@Test
	public void m2() {
		System.out.println("m2 Test");
	}
	
	@Test
	public void checkPalindrome() {
		boolean flag = Palindrome.palindrome();
		Assertions.assertEquals(true, flag);
	}
}
