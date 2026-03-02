package com.lpu2;

public interface EployeeCRUD {
	void saveEmployee(Employee5 e);
	void updateEmployeeSalary(int id, double sal);
	void updateEmployeeName(int id, String name);
	void updateEmployeePhone(int id, long phone);
	void deleteEmployee(int id);
	void findEmployee(int id);
	void findAllEmployee();
}
