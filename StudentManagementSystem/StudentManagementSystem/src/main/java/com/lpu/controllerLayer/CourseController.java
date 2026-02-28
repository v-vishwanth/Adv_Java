package com.lpu.controllerLayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.entity.Course;
import com.lpu.serviceLayer.CourseService;
import com.lpu.serviceLayer.StudentService;

public class CourseController {

    public static void main(String[] args) {
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		CourseService service= context.getBean(CourseService.class);
		
		//service.init();

       // CourseService service = new CourseService();
		

         Course c1 = service.addCourse("HiberNate", "Sandeep sir");
        System.out.println("Course: " + c1.getId() + " " + c1.getCourseName());

         Course found = service.findById(c1.getId());
        System.out.println("Found Course: " + found.getCourseName() + " - " + found.getTrainerName());

         service.updateCourse(found.getId(), "Advanced HiberNate");
        System.out.println("Course name updated!");

         Course updated = service.findById(found.getId());
        System.out.println("Updated Course: " + updated.getCourseName());

         service.assignCourseToStudent(1, 1);
        System.out.println("Course assigned successsuly.");
        System.out.println();
        context.close();
        
    }
}
