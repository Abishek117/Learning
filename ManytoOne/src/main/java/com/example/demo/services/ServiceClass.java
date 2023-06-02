package com.example.demo.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Entity.University;
import com.example.demo.repo.StudentRepository;
import com.example.demo.repo.UniversityRepository;

@Service
public class ServiceClass
{
	@Autowired
	StudentRepository repo1;
	
	@Autowired
	UniversityRepository repo2;
	
	@Autowired
	Students stud;
	
	@Autowired
	University univ;
	
	public void addEntity()
	{
		stud.setUniversity(univ);
		repo1.save(stud);
		System.out.println("Added");
	}
	
	public void remove()
	{
		repo2.deleteById(1102);
		System.out.println("Deleted");
	}
	
	public List<Students> getAll()
	{
		return repo1.findAll();
	}
	
	public Optional<Students> getById()
	{
		return repo1.findById(103);
	}
	
}
