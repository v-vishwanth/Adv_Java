package com.lpu.springBoot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.springBoot1.entity.Student;
import com.lpu.springBoot1.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	public Student saveStudent(Student s) {
		return repository.save(s);
	}
	
	public Student findStudentById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteStudent(Student s) {
		repository.delete(s);
	}
	
	public List<Student> findAll(){
		return repository.findAll();
	}
	
	public void deleteById(int id) {
		repository.deleteById(id);
	}
	
	public List<Student> saveAll(List<Student> s){
		repository.saveAll(s);
		return s;
	}
}
