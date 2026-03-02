package com.lpu.bidirectional.manytomany;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//import java.util.List;

import jakarta.persistence.EntityManager;
//import jakarta.persistence.Query;

public class FetchStudentAndSubjectById {
	public static void fetching(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Student1 s = em.find(Student1.class,id);
		
		System.out.println("Student_id -> " + s.getId() + ", Student_name -> " + s.getName() + ", Student_phoneno -> " + s.getPhoneno());
				
		for(Subject1 s1 : s.getSubjects()) {
			System.out.println("Subject_id -> " + s1.getId() + ", Subject_name -> " + s1.getName() + ", Subject_trainer -> " + s1.getTrainer());
		}
		
	}
}
