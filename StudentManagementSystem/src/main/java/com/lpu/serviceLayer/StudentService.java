package com.lpu.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.dao.StudentDao;
import com.lpu.entity.Student;



@Component
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	//private StudentDao dao=new StudentDao();
	public Student registerStudent(String name,int age,double marks) {
		if(age<18 || age>100) {
			throw new IllegalArgumentException("Student must be  in range between 18 to 100");
		}
		if(marks<0 || marks>100) throw new IllegalArgumentException("Marks should be in range between 0 to 100");
		
		Student s=new Student(name,age,marks);
		return dao.saveStudent(s);
		
 
		
	}
	
	public Student getStudent(int id) {
		Student s=dao.findStudentById(id);
		if(s==null) {
			throw new IllegalAccessError("Student Data is Not Exist");
		}
		return s;
		
	}
	public void updateMarks(int id,double newmarks) {
 		getStudent(id);
		
		if(newmarks<0 || newmarks>100) throw new IllegalArgumentException("Marks is invalid");

 		dao.updateStudentMarks(id, newmarks);
	}
	public void deleteStudent(int id) {
 		
		dao.deleteStudentById(id);
	}

}
