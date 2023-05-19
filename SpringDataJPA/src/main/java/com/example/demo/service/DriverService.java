package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Drivers;
import com.example.demo.repo.DriverRepo;

@Service
public class DriverService
{
	
	private DriverRepo repo;
	
	@Autowired
	Drivers drivers;
	
	@Autowired
	DriverService ds;

	@Autowired
	public DriverService(DriverRepo repo) {
		super();
		this.repo = repo;
	}
	
	public String add(Drivers entity)
	{
		int d1 = entity.getDriverId();
		
		
	}
	
	public List<Drivers> getDrivers()
	{
		return this.repo.findAll();
	}
	
	public Optional<Drivers> getId(int id)
	{
		return this.repo.findById(id);
	}
	
	public void delete(int id)
	{
		repo.deleteById(10432);
	}
	
	public ArrayList<Integer> getIds()
	{
		
	}
	
}
