package com.lpu.MultipleInterfaceReferance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		person p = context.getBean("person",person.class);
		System.out.println(p.getId());
		System.out.println(p.getName());
		p.getV().status();
		p.getf().eat();
	}
}
