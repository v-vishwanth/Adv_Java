package com.lpu.SpringBoot2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lpu.SpringBoot2.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// find by name
		List<Employee> findByName(String name);
		
		// find by department
		List<Employee> findByDepartment(String department);
		
		// find by phone
		@Query("Select e from Employee e where e.phone=:phone")
		Employee findByPhone(long phone);
		
		//find by email
		@Query(nativeQuery = true, value = "select * from Employee where email = :email")
		Employee findByEmail(String email);
}
