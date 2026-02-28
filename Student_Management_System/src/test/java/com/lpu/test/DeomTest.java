package com.lpu.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.lpu.entity.Student;

public class DeomTest {
	@Test
	public void demo1() {
		// check equal are not
		Assertions.assertEquals("xyz", "xyz");
	}
	
	@Test
	public void demo2() {
		Assertions.assertNotNull(null,"Nul value not allowed");
	}
	@Test
	public void demo3() {
		Assertions.assertThrows(ArithmeticException.class, ()->{
			int res = 7/0;
		});
	}
	
	@Test
	public void demo4() {
		Assertions.assertDoesNotThrow(()->{
			int res = 7/0;
		});
	}
	
	@Test
	public void demo5() {
		String str1 = "abcdef";
		String str2 = "abcdef";
		Assertions.assertSame(str1, str2);
	}
	
	@Test
	public void demo6() {
		Student s1 = new Student();
		Student s2 = new Student();
		
		Assertions.assertSame(s1, s2);
	}
	
	@Test
	public void demo7() {
		int age = 15;
		if(age<18) {
			fail("age is not 18");
		}
	}
	
	@Test
	public void demo8() {
		boolean res = true;
		Assertions.assertTrue(res);
	}
	
	@Test
	public void demo9() {
		boolean res = false;
		Assertions.assertFalse(res);
	}
	
	@ParameterizedTest
	@CsvSource({"2,3,5","1,-1,0","5,5,0"})
	public void demo10(int a,int b,int expected) {
		int res = a+b;
		Assertions.assertEquals(expected, res);
	}
	
	@BeforeAll
	public static void m1() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void m2() {
		System.out.println("After Alll");
	}
	
	@BeforeEach
	public void m3() {
		System.out.println("after Each test case");
	}
	
	
	
	
	
	
	
}
