package com.lpu.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class studentController {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		studentService service = context.getBean(studentService.class);
		service.registerStudent(new student(101,"ddjfw"));
	}
}
