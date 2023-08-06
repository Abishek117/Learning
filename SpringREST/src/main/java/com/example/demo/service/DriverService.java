package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Drivers;
import com.example.demo.exception.UserNotFoundException;
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
	
	/*
	 * Customized response with response entity
	 */
	public ResponseEntity<Object> findDriver(int id) 
	{	
		//It's always good to handle the response in a seperate class!!! 
		try {
			return handler.responseHandler("Driver with the id "+id+" found", HttpStatus.OK, repo.findById(id).orElseThrow(()->new UserNotFoundException("Driver not found with id "+id)));
			//return new ResponseEntity<Object>(repo.findById(id).orElseThrow(()->new RuntimeException(id+" not found")), HttpStatus.OK);
		}
		catch(UserNotFoundException e){
			return new ResponseEntity<Object>(new Drivers(0,"",0),HttpStatus.NOT_FOUND);
			//return new ResponseEntity<>("Driver with the id "+id+" not found", HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	 * Response with handled exception by using @ExceptionHandler.Even though we can custom response with response entity it better to handle exceptions and return response using @ExceptionHandler
	 */
	public Drivers findDriverByGivenId(int id)
	{
		return repo.findById(id).orElseThrow(() -> new UserNotFoundException("Driver not found with id "+id));
	}
	
	/*
	 * If driver with the given id found, returns custom response by Response entity else returns response by ExceptionHandler
	 */
	public ResponseEntity<Object> getDriver(int id) 
	{	 
		return handler.responseHandler("Driver with the id "+id+" found", HttpStatus.OK, repo.findById(id).orElseThrow(()->new UserNotFoundException("Driver not found with id "+id)));
	}
	
}
