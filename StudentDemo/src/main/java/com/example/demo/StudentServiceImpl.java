package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public String getData() {
		studentDao.getStudent();
		return "success";
	}

}
