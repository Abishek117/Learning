package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService 
{
	private StudentRepository studentRepository;
	
	@Autowired
	Student student;
	
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public Student add(Student student)
	{
		return studentRepository.save(student);
	}
	
	public List<Student> getByName(String name)
	{
		return studentRepository.getByName(name);
	}
	

}
