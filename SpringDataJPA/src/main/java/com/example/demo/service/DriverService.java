package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Drivers;
import com.example.demo.repo.DriverRepo;

@Service
public class DriverService
{
	@Autowired
	private DriverRepo repo;

	public DriverService(DriverRepo repo) {
		super();
		this.repo = repo;
	}
	
	
	public Drivers add(Drivers entity)
	{
		return this.repo.save(entity);
	}

}
