package com.lpu.lifeCycle;

import java.util.logging.ErrorManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.DI.student;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Component
public class DBconnection {
	EntityManagerFactory emf;
	public DBconnection() {
		System.out.println("Bean object creation");
	}
	@PostConstruct
	public void init() {
		emf = Persistence.createEntityManagerFactory("dev");
		
	}
	public void fetch() {
		EntityManager em = emf.createEntityManager();
		student s = em.find(student.class, 101);
		System.out.println(s.getName());
		System.out.println("use bean Object");
	}
	@PreDestroy
	public void closeEMF() {
		emf.close();
		System.out.println("Pre destroy");
	}
}
