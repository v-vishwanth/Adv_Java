package com.lpu.springBoot1.comtroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lpu")
@RestController
public class lpuController {
	@RequestMapping("/m1")
	public String m1() {
		return "m1 Method";
	}
	
	@PostMapping("/student")
	public String saveStudent() {
		return "Student saved";
	}
	
	@PostMapping("/trainer")
	public String saveTrainer() {
		return "Trainer Saved";
	}
	
	
}
