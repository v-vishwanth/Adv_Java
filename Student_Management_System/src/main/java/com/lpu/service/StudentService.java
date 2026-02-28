package com.lpu.service;

import com.lpu.dao.CourseDao;
import com.lpu.dao.StudentDao;
import com.lpu.entity.Course;
import com.lpu.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentService {
	
	private StudentDao dao=new StudentDao();
	
	public Student registerStudent(String name,int age,double marks) {
		if(age<18 || age>100) {
			throw new IllegalArgumentException("Students must be 18");
			
		}
		if(marks<0 || marks>100) {
			throw new IllegalArgumentException("Invalid marks");
		}
		Student s=new Student(name,age,marks);
		return dao.saveStudent(s);
	}
	
	public Student getStudent(int id) {
		Student s=dao.findStudentById(id);
		if(s == null) {
			throw new IllegalArgumentException("Student Not Found");
		}
		return s;
	}
	
	public void updateMarks(int id,double marks) {
		if(marks<0 || marks>100) {
			throw new IllegalArgumentException("Invalid marks");
		}
		dao.updateStudentMarks(id, marks);
		
	}
	
	public void deleteStudent(int id) {
		getStudent(id);
		dao.deleteStudentById(id);
	}
	
	public void giveCourseToStudent(int studentId, int courseId) {

	    EntityManager em = Persistence
	            .createEntityManagerFactory("dev")
	            .createEntityManager();

	    EntityTransaction et = em.getTransaction();

	    Student student = em.find(Student.class, studentId);
	    Course course = em.find(Course.class, courseId);

	    if (student == null || course == null) {
	        throw new IllegalArgumentException("Invalid Id");
	    }

	    et.begin();
	    student.addCourse(course);
	    et.commit();

	    em.close();
	}	
}