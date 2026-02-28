package com.lpu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lpu.entity.Student;
import com.lpu.serviceLayer.StudentService;

public class StudentServiceTest {
	
	static StudentService service=null;
	
	@BeforeAll
	public static void m1() {
		System.out.println("After all");
		
	}
	@AfterAll
	public static void m2() {
		System.out.println("After all");
		
	}
	
	@Test
	public void testAge() {
		Student s=service.getStudent(1);
		
		int age=s.getAge();
		
 	 
		
	}
	
	
	
 
	
 	

}
