package com.lpu.manytoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		
//		Company company = new Company(10,"capg","bangalore");
//		
//		Emp e1 = new Emp(1,"Abhishek",30.00,company);
//		Emp e2 = new Emp(2,"Prakash",80.00,company);
//		Emp e3 = new Emp(3,"Satyam",78.00,company);
//
//		tx.begin();
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(e3);
//		em.persist(company);
//		tx.commit();
		
		
//		Company company = new Company(20,"cogn","chennai");
//		
//		Emp e1 = new Emp(4,"Ayush",30.00,company);
//		Emp e2 = new Emp(5,"Priyanshu",80.00,company);
//		Emp e3 = new Emp(6,"Aman",78.00,company);
//
//		tx.begin();
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(e3);
//		em.persist(company);
//		tx.commit();
		
		//FETCHING
		FetchingAllEmployees.fetchingAllEmployees();
		
		//FETCHING COMPANY BY EMPLOYEE ID
		FetchingEmployee.fetchingEmployee(4);
	}
}
