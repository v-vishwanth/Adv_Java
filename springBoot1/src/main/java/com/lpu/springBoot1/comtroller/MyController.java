package com.lpu.springBoot1.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.springBoot1.entity.Student;

@RestController
public class MyController {
	@GetMapping("/hi")
	public String takeRequest() {
		return "byeeeee";
	}
	@GetMapping("/takeData")//http://localhost:8080/takeData?id=108&name=Vishwanth
	public String takeData(@RequestParam int id,@RequestParam String name) {
		return "Id = "+id+" Name = "+name;
	}
	@GetMapping("/takeData2/{id}")//http://localhost:8080/takeData2/1001
	public String takeData2(@PathVariable int id) {
		return "ID="+id;
	}
	@GetMapping("/takeData3/{id}/{name}")//http://localhost:8080/takeData3/1001/Cat
	public String takeData3(@PathVariable int id,@PathVariable String name) {
		return "ID="+id+" Name="+name;
	}
	@GetMapping("/getCollege")//http://localhost:8080/getCollege?id=109&name=Donkey&location=Forest
	public String getCollege(@RequestParam int id,@RequestParam String name,@RequestParam String location) {
		return "ID="+id+" Name="+name+" Location="+location;
	}
	
	@GetMapping("/takeData4/student/{sID}/college/{cID}")//http://localhost:8080/takeData4/student/101/college/102
	public String takeData4(@PathVariable int sID,@PathVariable int cID) {
		return "Student ID="+sID+"\n"+"College ID="+cID;
	}
	@GetMapping("/takeData5")//http://localhost:8080/takeData5
	public String takeData5(@RequestHeader int id,@RequestHeader String name) {
		return "ID="+id+" Name="+name;
	}
	
	@GetMapping("/student2")//https://localhost:8080/student2
	public String getStudent(@RequestBody Student s) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		return s.getName()+"is called";
	}
	

	
}











