package com.lpu.springBoot1.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.springBoot1.entity.College;
import com.lpu.springBoot1.service.CollegeService;
@RequestMapping("/college")
@RestController
public class CollegeController {
	@Autowired
	private CollegeService cservice;
	
	@PostMapping("/save")
	public College save(@RequestBody College college) {
		return cservice.saveCollege(college);
	}
}
