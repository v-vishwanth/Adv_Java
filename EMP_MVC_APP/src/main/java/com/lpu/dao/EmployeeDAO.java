package com.lpu.dao;

import java.util.List;
import com.lpu.Entity.Employee;

public interface EmployeeDAO {

	void saveEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	void updateEmployee(Employee employee);
	void deleteEmployee(int id);
}
