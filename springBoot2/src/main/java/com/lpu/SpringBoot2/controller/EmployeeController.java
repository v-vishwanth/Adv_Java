package com.lpu.SpringBoot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.SpringBoot2.Entity.Employee;
import com.lpu.SpringBoot2.service.EmployeeService;
@RequestMapping("/api")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee Emp) {
		return empService.addEmployee(Emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployees(){
		return empService.getAllEmployee();
	}
	
	@GetMapping("/employees/id")
	public Employee FindById(@RequestParam int id) {
		return empService.findid(id);
	}
	
	@DeleteMapping("/employees")
	public String DeleteById(@RequestParam int id) {
		return empService.Deleteid(id);
	}
	
	@GetMapping("/employees/search/name")
	public List<Employee> getEmployeeByName(@RequestParam String name){
		return empService.getEmployeename(name);
	}
	
	@GetMapping("/employees/search/department")
	public List<Employee> getEmployeeByDepartment(@RequestParam String department){
		return empService.getEmployeedept(department);
	}
	
	@GetMapping("/employees/search/phone")
	public Employee getEmployeeByPhone(@RequestParam long phone){
		return empService.getEmployeePhone(phone);
	}
	
	@GetMapping("/employees/search/email")
	public Employee getEmployeeByEmail(@RequestParam String email) {
		return empService.getEmployeeemail(email);
	}
	
	
}
