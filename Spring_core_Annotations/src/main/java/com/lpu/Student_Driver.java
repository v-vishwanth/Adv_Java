package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Student_Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Student_class st = context.getBean("Student",Student_class.class);
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getLocation());
		System.out.println(st.getStdId().getstudentId());
		
	}
}
