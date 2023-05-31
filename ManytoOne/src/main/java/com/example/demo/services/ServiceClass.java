package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Entity.University;
import com.example.demo.repo.StudentRepository;

@Service
public class ServiceClass
{
	@Autowired
	StudentRepository repo;
	
	@Autowired
	Students stud;
	
	@Autowired
	University univ;
	
	public void addEntity()
	{
		stud.setUniversity(univ);
		repo.save(stud);
		System.out.println("Added");
	}
	
	

}
