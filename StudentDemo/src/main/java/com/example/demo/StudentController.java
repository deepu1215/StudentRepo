package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getData")
	public String getStudent() {
		studentService.getData();
		String string = "gdfd";
		string.equals(string);
		 return "success";
	}
}
