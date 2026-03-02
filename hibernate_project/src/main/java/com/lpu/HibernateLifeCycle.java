package com.lpu;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class HibernateLifeCycle {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		//TRANSIENT STATE
		tx.begin();
//		Student s = new Student();
//		s.setStudentId(900);
//		s.setName("Lallu");    --> Nothing will happen because it is in Transient or New State
//		s.setPhone(987654l);
		
		
//		Student s = new Student();
//		s.setStudentId(900);
//		s.setName("Lallu");    
//		s.setPhone(987654l)
		;
//		//PERSISTENCE STATE
//		em.persist(s);     //-->Now, It has moved to persistence state,means whatever we do after this will be directly reflected in database as well
//		s.setName("Kallu");   //We do not have to merge it automatically reflect changes when object is in persistence state
		
		//PERSISTENCE STATE
//		Student s = em.find(Student.class, 900);    -->Again we do not have to merge because we are in persistence state
//		s.setName("Mallu");
		
		
		//DETACHED STATE
//		Student s = em.find(Student.class, 900);
//		em.detach(s);                  -->Nothing gonna happen if you do modification after detach because detach usually remove the object from persistence state but database for that particular object but that object will be remain in database
//		s.setName("Ballu");
		
		
		//DETACHED STATE
//		Student s = em.find(Student.class, 900);
//		em.detach(s);
//		s.setName("Ballu");            -->Now, we have merged again so Ballu will be reflected
//		em.merge(s);
		
		//DETACHED STATE
//		Student s = em.find(Student.class, 900);
//		em.detach(s);     -->We will get duplicate key value error because detach just remove the object from persistent state not from database it does exists in database so by writing persist() it will again try to add that object assuming its new so kindly use merge()
//		s.setName("Makalu");
//		em.persist(s);
		
		//DETACHED STATE
		Student s = em.find(Student.class, 900);
		em.detach(s);     //We can also use em.close() for detach which closes the connection
		s.setName("Makalu");
		em.merge(s);     //-->It will work because we have used merge() which will check and apply
		
		tx.commit();
		
	}
}
