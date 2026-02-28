package com.lpu.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.dao.Coursedao;
import com.lpu.entity.Course;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Component
public class CourseService {

   // private    Coursedao cours;
	
	@Autowired
	private Coursedao cours;
	@PostConstruct
	public void init() {
		System.out.println("Courser Constructor is started");
		
		
		//cours = new Coursedao();
		
	}

     public Course addCourse(String name, String trainerName) {
        if (name == null || name.isEmpty() || trainerName == null || trainerName.isEmpty()) {
            throw new IllegalArgumentException("Please put correct details");
        }

        Course c = new Course(name, trainerName);
        return cours.saveCourse(c);    
    }

     public Course findById(int id) {
        Course cor = cours.findCourseById(id);
        if (cor == null) {
            throw new IllegalArgumentException("Course ID is not valid");
        }
        return cor;
    }
     public void assignCourseToStudent(int studentId, int courseId) {
          cours.giveCourseToStudent(studentId, courseId);
     }

     public void updateCourse(int id, String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty");
        }

        Course cor = cours.findCourseById(id);
        if (cor == null) {
            throw new IllegalArgumentException("Course ID is not valid");
        }

        cours.updateCourse(id, name);   
    }
     
     @PreDestroy
     
     public void distory() {
    	 System.out.println("DB of COurse is close");
     }
}
