package com.lpu2;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import java.util.List;

public class EmployeeCruding {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;
	
	static {
		emf = Persistence.createEntityManagerFactory("dev");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	public void saveEmployee(Employee5 e) {
		tx.begin();
		em.persist(e);
		tx.commit();
	}
	
	public void updateEmployeeSal(int id, double sal) {
		Employee5 e = em.find(Employee5.class, id);
		
		e.setSal(sal);
		
		tx.begin();
		em.merge(e);
		tx.commit();
	}
	
	public void updateEmployeeName(int id, String name) {
		Employee5 e = em.find(Employee5.class, id);
		e.setName(name);
		
		tx.begin();
		em.merge(e);
		tx.commit();
	}
	
	public void updateEmployeePhone(int id, long phone) {
		Employee5 e = em.find(Employee5.class, id);
		e.setPhone(phone);
		
		tx.begin();
		em.merge(e);
		tx.commit();
	}
	
	public void deleteEmployee(int id) {
		Employee5 e = em.find(Employee5.class, id);
		
		tx.begin();
		em.remove(e);
		tx.commit();
	}
	
	public void findEmployee(int id) {
		Employee5 e = em.find(Employee5.class, id);
		
		System.out.println("Id->"+e.getId() + ", Name->" + e.getName() + ", Salary->" + e.getSal() + ", Phone->" + e.getPhone());
	}
	
	public void findAllEmployee() {
		Query query = em.createQuery("SELECT e5 FROM Employee5 e5");
		
		List<Employee5> list = query.getResultList();
		
		for(Employee5 e5 : list) {
			System.out.println("Id->"+e.getId() + ", Name->" + e.getName() + ", Salary->" + e.getSal() + ", Phone->" + e.getPhone());
		}
	}
}
