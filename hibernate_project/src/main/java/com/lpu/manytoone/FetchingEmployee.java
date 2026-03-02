package com.lpu.manytoone;

import jakarta.persistence.*;
import java.util.*;

public class FetchingEmployee {
	public static void fetchingEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT e FROM Emp e Where id=:id");
		query.setParameter("id", id);
		Emp e = (Emp) query.getSingleResult();

		System.out.println("Employee_Id -> " + e.getId() + ", Employee_Name -> " + e.getName() + ", Employee_Salary -> "
				+ e.getSal());
		System.out.println("Company_Id -> " + e.getCompany().getId() + ", Company_Name -> " + e.getCompany().getName()
				+ ", Company_Location -> " + e.getCompany().getLocation());
	}
}