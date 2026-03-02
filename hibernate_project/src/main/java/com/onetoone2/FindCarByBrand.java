package com.onetoone2;


import jakarta.persistence.*;
import java.util.List;

public class FindCarByBrand {
	public static void findingCar(String brand) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT c FROM Car c WHERE c.brand= :brand" );
		query.setParameter("brand",brand);
		
		Car c = (Car)query.getSingleResult();
		System.out.println("Car_Id -> " + c.getId() + ", Car_Brand -> " + c.getBrand() + ", Car_Engine_Id -> " + c.getE().getId() + ", Car_Engine_Cc -> " + c.getE().getCc());
	}
}
