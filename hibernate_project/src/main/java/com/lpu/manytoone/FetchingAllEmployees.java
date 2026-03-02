package com.lpu.manytoone;

import jakarta.persistence.*;
import java.util.*;

public class FetchingAllEmployees {
	public static void fetchingAllEmployees() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT e FROM Emp e");
		List<Emp> list = query.getResultList();
		
		for(Emp e : list) {
			System.out.println("Employee_Id -> " + e.getId() + ", Employee_Name -> " + e.getName() + ", Employee_Salary -> " + e.getSal());
			System.out.println("Company_Id -> " + e.getCompany().getId() + ", Company_Name -> " + e.getCompany().getName() + ", Company_Location -> " + e.getCompany().getLocation());
		}
	}
}
