package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Drivers;
import com.example.demo.handler.ResponseHandler;
import com.example.demo.repo.DriverRepo;

@Service
public class DriverService 
{
	@Autowired
	DriverRepo repo;

	@Autowired
	ResponseHandler handler;
	
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
		//return repo.findById(id).orElseThrow(()->new RuntimeException(id+" not found"));
	}

	public Optional<Drivers> findDriverByIdAndAge(int id, int age) 
	{
		return repo.findByDriverIdAndAge(id, age);
	}

	public Optional<Drivers> findByAge(int age) 
	{
		return repo.findDriverByAge(age);
	}
	
	public ResponseEntity<Object> findDriver(int id) 
	{	
		//It's always good to handle the response in a seperate class!!! 
		try {
			return handler.responseHandler("Driver with the id "+id+" found", HttpStatus.OK, repo.findById(id).orElseThrow(()->new RuntimeException(id+" not found")));
			//return new ResponseEntity<Object>(repo.findById(id).orElseThrow(()->new RuntimeException(id+" not found")), HttpStatus.OK);
		}
		catch(RuntimeException e){
			return handler.responseHandler("Driver with the id "+id+" not found", HttpStatus.NOT_FOUND, new Drivers(0,"",0));
			//return new ResponseEntity<Object>(new Drivers(0,"",0),HttpStatus.NOT_FOUND);
			//return new ResponseEntity<>("Driver with the id "+id+" not found", HttpStatus.NOT_FOUND);
		}
	}
}
