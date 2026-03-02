package com.onetoone2;


import jakarta.persistence.*;
import java.util.List;

public class FindAllCar {
	public static void findingAllCar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT c FROM Car c");
		List<Car> list = query.getResultList();
		for(Car c : list) {
			System.out.println("Car_Id -> " + c.getId() + ", Car_Brand -> " + c.getBrand() + ", Car_Engine_Id -> " + c.getE().getId() + ", Car_Engine_Cc -> " + c.getE().getCc());
		}
	}
}
