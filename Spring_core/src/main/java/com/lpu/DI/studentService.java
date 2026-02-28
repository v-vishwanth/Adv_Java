package com.lpu.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class studentService {
	@Autowired
	studentDAO dao;
	public void registerStudent(student s) {
		dao.saveStudent(s);
	}
}
