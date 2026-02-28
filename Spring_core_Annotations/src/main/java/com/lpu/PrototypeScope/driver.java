package com.lpu.PrototypeScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		person p1 = context.getBean("person",person.class);
		person p2 = context.getBean("person",person.class);
		person p3 = context.getBean("person",person.class);
		person p4= context.getBean("person",person.class);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		
	}
}
