package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Drivers;
import com.example.demo.repo.DriverRepo;

@Service
public class DriverService 
{
	@Autowired
	DriverRepo repo;

	
	public List<Drivers> getDrivers()
	{
		return repo.findAll();
	}
	
	public Drivers addDriver(Drivers d)
	{
		return repo.save(d);
	}
	
	
	public void deleteDriver(int id)
	{
		repo.deleteById(id);
	}

	public Optional<Drivers> findDriverById(int id) 
	{
		return repo.findById(id);
	}

	public Optional<Drivers> findDriverByIdAndAge(int id, int age) 
	{
		return repo.findByDriverIdAndAge(id, age);
	}

	public Optional<Drivers> findByAge(int age) 
	{
		return repo.findDriverByAge(age);
	}
}
