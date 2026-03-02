package com.onetoone2;


import jakarta.persistence.*;

public class FindCar {
	public static void findingCar(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Car c = em.find(Car.class, id);
		System.out.println("Car_Id -> " + c.getId() + ", Car_Brand -> " + c.getBrand() + ", Car_Engine_Id -> " + c.getE().getId() + ", Car_Engine_Cc -> " + c.getE().getCc());
	}
}
