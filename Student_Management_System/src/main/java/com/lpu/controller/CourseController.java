package com.lpu.controller;

import com.lpu.entity.Course;
import com.lpu.service.CourseService;

public class CourseController {

    private static CourseService courseService = new CourseService();

    public static void main(String[] args) {

        // Register Course
        courseService.registerCourse("C#", "Ajay");

        // Update Trainer
         courseService.updateTrainer(1, "Mr. Kumar");

        // Get Course
        Course c = courseService.getCourse(1);
//        System.out.println("Course ID: " + c.getId());
        System.out.println("Course Name: " + c.getName());
        System.out.println("Trainer: " + c.getTrainer());

        // Delete Course
        // courseService.deleteCourse(1);
    }
}