package com.lpu;
//import StudentCRUD;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.List;

public class StudentCruding implements StudentCRUD{
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;
	
	static {
		emf = Persistence.createEntityManagerFactory("dev");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	@Override
	public void saveStudent(Student s) {
		tx.begin();
		em.persist(s);
		tx.commit();
	}
	
	@Override
	public void updateStudentName(int id, String name) {
		Student s = em.find(Student.class, id);
		s.setName(name);
		
		tx.begin();
		em.merge(s);
		tx.commit();
	}
	
	public void updateStudentPhone(int id, long phone) {
		Student s = em.find(Student.class, id);
		s.setPhone(phone);
		
		tx.begin();
		em.merge(s);
		tx.commit();
	}
	
	@Override
	public void deleteStudent(int id) {
		Student s = em.find(Student.class, id);
		
		tx.begin();
		em.remove(s);
		tx.commit();
	}
	
	@Override
	public void findStudent(int id) {
		Student s = em.find(Student.class, id);
		System.out.println(s);
	}
	
	@Override
	public void findAllStudent() {
		List<Student> list = em.createQuery("SELECT s FROM Student s").getResultList();
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
