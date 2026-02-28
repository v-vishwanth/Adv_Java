package com.lpu.controllerLayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.entity.Student;
import com.lpu.serviceLayer.StudentService;

public class StudentController {
	//private static StudentService service = new StudentService();

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		StudentService service= context.getBean(StudentService.class);
		

		service.registerStudent("Jami", 26, 61.55);
		service.updateMarks(2, 79);

		Student s = service.getStudent(2);
		System.out.println(s);

		service.updateMarks(1,34);
		

	}

}
