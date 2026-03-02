package com.lpu.springBoot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.springBoot1.entity.College;
import com.lpu.springBoot1.repository.CollegeRepository;

@Service
public class CollegeService {
	@Autowired
	private CollegeRepository crepository;
	
	public College saveCollege(College college) {
		return crepository.save(college);
	}
	
}
