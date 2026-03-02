package com.lpu;
//import StudentCruding;
public class StudentService {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setStudentId(11);
//		s1.setName("Sunita");
//		s1.setPhone(9876543210l);
		
		StudentCruding sc = new StudentCruding();
		
		//Inserting
//		sc.saveStudent(s1);
		
		
		//Updating
//		sc.updateStudentName(11, "Payal");
//		sc.updateStudentPhone(11, 8888999987l);
		
		//Deleting
//		sc.deleteStudent(11);
		
		//Fetching
//		sc.findStudent(5);
		
		sc.findAllStudent();
	}
}
