package com.lpu.SpringBoot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.SpringBoot2.Entity.Employee;
import com.lpu.SpringBoot2.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}
	
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}
	
	public Employee findid(int id) {
		return empRepo.findById(id).orElse(null);
	}
	
	public String Deleteid(int id) {
		empRepo.deleteById(id);
		return id+" was deleted";
	}
	
	public List<Employee> getEmployeename(String name) {
		return empRepo.findByName(name);
	}
	
	public List<Employee> getEmployeedept(String department) {
		return empRepo.findByDepartment(department);
	}
	
	public Employee getEmployeePhone(long phone) {
		return empRepo.findByPhone(phone);
	}
	public Employee getEmployeeemail(String email) {
		return empRepo.findByEmail(email);
	}
}
