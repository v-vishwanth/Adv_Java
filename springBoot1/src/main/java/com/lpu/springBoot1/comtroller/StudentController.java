package com.lpu.springBoot1.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.springBoot1.entity.Student;
import com.lpu.springBoot1.service.StudentService;
@RestController

public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/student")
	public Student save(@RequestBody Student s) {
		return service.saveStudent(s);
	}
	
	@GetMapping("/student/{id}")
	public Student find(@PathVariable int id) {
		return service.findStudentById(id);
	}
	
	@DeleteMapping("/student")
	public String delete(@RequestBody Student s) {
		service.deleteStudent(s);
		return "Student data deleted";
	}
	
	@GetMapping("/student")
	public List<Student> findAllStudent(){
		return service.findAll();
	}
	@DeleteMapping("/student/{id}")
	public String deleteById(@PathVariable int id) {
		service.deleteById(id);
		return "deleted by id";
	}
	
	@PostMapping("/studentall")
	public List<Student> saveAll(@RequestBody List<Student> s) {
		return service.saveAll(s);
	}
	
}
