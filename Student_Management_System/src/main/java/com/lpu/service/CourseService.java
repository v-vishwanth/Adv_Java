package com.lpu.service;

import com.lpu.dao.CourseDao;
import com.lpu.entity.Course;

public class CourseService {

    private CourseDao dao = new CourseDao();

   
    public Course registerCourse(String name, String trainer) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty");
        }

        if (trainer == null || trainer.trim().isEmpty()) {
            throw new IllegalArgumentException("Trainer name cannot be empty");
        }

        Course c = new Course(name, trainer);
        return dao.saveCourse(c);
    }

   
    public Course getCourse(int id) {
        Course c = dao.findCourseById(id);

        if (c == null) {
            throw new IllegalArgumentException("Course Not Found");
        }

        return c;
    }

    
    public void updateTrainer(int id, String trainer) {

        if (trainer == null || trainer.trim().isEmpty()) {
            throw new IllegalArgumentException("Trainer name cannot be empty");
        }

        getCourse(id); 
        dao.updateCourseTrainer(id, trainer);
    }

    
    public void deleteCourse(int id) {
        getCourse(id); 
        dao.deleteCourseById(id);
    }
}