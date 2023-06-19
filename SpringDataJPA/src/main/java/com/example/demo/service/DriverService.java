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
	public DriverService(DriverRepo repo) {
		super();
		this.repo = repo;
	}
	
	public Drivers add(Drivers entity)
	{
		return this.repo.save(entity);
	}
	
	public String addEntity(Drivers entity)
	{
		ArrayList<Integer> arr = repo.getByDriverId();
		if(arr.contains(entity.getDriverId()))
		{
			return "Id already exists!..";
		}
		else
		{
			repo.save(entity);
			return "Entry added..";
		}
	}
	

	public List<Drivers> getDrivers()
	{
		return this.repo.findAll();
	}
	
	public Optional<Drivers> getById(int id)
	{
		return this.repo.findById(id);
	}
	
	public ArrayList<Drivers> getByName(String name)
	{
		return this.repo.findByDriverName(name);
	}
	
	public void deleteById(int id)
	{
		repo.deleteById(id);
		//return "Entry Deleted";
	}
	
	public String updateAge(int age,int id)
	{
		repo.updateByAge(age,id);
		return "Entry updated";
	}
	
}
