package com.lpu.springBoot1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lpu.springBoot1.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	//CUSTOM METHODS:-
		//By name
		List<Student> findByName(String name);
		//By phone
		List<Student> findByPhone(long phone);
		
		
		//CUSTOM QUERY
		//By name
		@Query("select s from Student s where s.name=:name")
		List<Student> getStudentByName(String name);
		
		
		@Query(nativeQuery = true, value = "select * from Student")
		List<Student> getAllStudents();
}
