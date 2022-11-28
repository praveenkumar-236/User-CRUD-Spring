package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImp;

@RestController
@RequestMapping("/student")
public class Controller {
	
	@Autowired
	StudentServiceImp Student_Service;
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Student student){
		try {
			student=Student_Service.add(student);
			return new ResponseEntity<Student>(student, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<> (HttpStatus.CONFLICT);
		}
		
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllStudent(){
		List<com.example.demo.entity.Student> slist = Student_Service.getAllStudent();
		if(slist.size()==0) {
			return new ResponseEntity<> (HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Student>>(slist, HttpStatus.OK);
		
	}

}
