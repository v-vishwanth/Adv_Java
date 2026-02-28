package com.practice;

import java.util.logging.ErrorManager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Aadhar a1 = new Aadhar();
		a1.setStudentid(1);
		a1.setLocation("HYD");
		em.persist(a1);
		
		Aadhar a2 = new Aadhar();
		a2.setStudentid(2);
		a2.setLocation("KDD");
		em.persist(a2);
		
		Aadhar a3 = new Aadhar();
		a3.setStudentid(3);
		a3.setLocation("HNR");
		em.persist(a3);
		
		student s1 = new student();
		s1.setName("Cat");
		s1.setPhone(8787687);
		s1.setStudentIid(1);
		s1.setAdha(a1);
		em.persist(s1);
		
		student s2 = new student();
		s2.setName("DOG");
		s2.setPhone(878769342);
		s2.setStudentIid(2);
		s2.setAdha(a2);
		em.persist(s2);
		
		student s3 = new student();
		s3.setName("Monkey");
		s3.setPhone(12323454);
		s3.setStudentIid(3);
		s3.setAdha(a3);
		em.persist(s3);
		
		et.commit();
		
	}

}
