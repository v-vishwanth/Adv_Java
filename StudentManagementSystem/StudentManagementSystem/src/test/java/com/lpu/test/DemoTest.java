package com.lpu.test;

import static org.junit.jupiter.api.Assertions.fail;

  import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DemoTest {
	
	@BeforeAll
	public static void m1() {
		System.out.println("Before all");
	}
	@AfterAll
	public static void m2() {
		System.out.println("After all");
	}
	
	@BeforeEach
	public   void m3() {
		System.out.println("After each test method");
	}
	@AfterEach
	public   void m4() {
		System.out.println("After each test method");
	}
	
	@Test
	public void demo1() {
		
		
		Assertions.assertEquals("jami", "jami");
	}
	@Test
	public void demo2() {
		Assertions.assertNotNull(1,"value is not nulll");
	}
	
	@Test
	public void demo3() {
		Assertions.assertThrows(ArithmeticException.class, ()->{
			int a=10/0;
		});
	}
	@Test
	public void demo4() {
		
		//checks whether it is not throws execption
		Assertions.assertDoesNotThrow( ()->{
			int a=10/8;
			 
		});
	}
	@Test
	public void demo5() {
		String s1="xyz";
		String s2="xyz";
		
		//compare  the reference 
		
 
		Assertions.assertSame( s1,s2);
	}
	@Test
	public void demo6() {
		int age=19;
		if(age<18) {
			fail("age is less then 18");
		}
	}
	@Test
	public void demo7() {
		int []arr= {12,1,13};
		int [] arr2= {12,1,13};
		Assertions.assertArrayEquals(arr, arr2);
 
	}
	 
	@Test
	public void demo8() {
		boolean res=true;
		Assertions.assertTrue(res);
		
	}
	@Test
	public void demo9() {
		boolean res=false;
		Assertions.assertFalse(res);
		
	}
	@ParameterizedTest
	@CsvSource({"2,3,5","10,20,30","1,-1,0"})
	public void demo10(int a,int b,int c) {
		int res=a+b;
		Assertions.assertEquals(c, res);
 
		
	}
	

}
