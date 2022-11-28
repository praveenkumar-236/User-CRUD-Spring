
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentServiceImp implements Student_Service{
	
	@Autowired
	com.example.demo.Repository.Student_Repository studentRepo;

	@Override
	public Student add(Student student) {
		int id = studentRepo.findAll().size()+1;
		student.setS_no(id);
		studentRepo.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

}