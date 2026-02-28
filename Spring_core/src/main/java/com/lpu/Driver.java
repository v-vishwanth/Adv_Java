package com.lpu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
//		BeanFactory b; 
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		
//		System.out.println("main start");
////		Student student = new Student();
////		Student student = (Student)context.getBean("myStudent");
////		or
//		Student student = context.getBean("myStudent",Student.class);
//		student.study();
//		Employee emp = (Employee)context.getBean("emp");
//		emp.work();
//		System.out.println("Main end");
		
//	------------DI using Fields-----------use property tag in config.xml-----------	
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		emp.work();
		
		Laptop laptop = emp.getLaptop();
		laptop.start();
//		emp.getLaptop().start();
	}

}
