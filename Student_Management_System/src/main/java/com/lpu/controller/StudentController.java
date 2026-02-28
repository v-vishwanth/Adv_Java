package com.lpu.controller;

import com.lpu.entity.Student;
import com.lpu.service.StudentService;

public class StudentController {

	private static StudentService studentservice = new StudentService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentservice.registerStudent("Krishna", 23, 89);
		//studentservice.updateMarks(1, 98);
		
//		Student s=studentservice.getStudent(1);
//		System.out.println(s);
		
		
		studentservice.giveCourseToStudent(1, 1);
		studentservice.giveCourseToStudent(1, 2);

		
		
		

	}

}