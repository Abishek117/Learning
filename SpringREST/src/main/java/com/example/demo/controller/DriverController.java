package com.example.demo.controller;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Drivers;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.handler.ResponseHandler;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping(path = "/api/v1")
public class DriverController 
{
	@Autowired
	DriverService service;
	
	@GetMapping(path = "/drivers")
	public List<Drivers> getDrivers()
	{
		return service.getDrivers();
	}
	
	@PostMapping(path = "/add")
	public Drivers addDriver(@RequestBody Drivers driver)
	{
		return service.addDriver(driver);
	}
	
	@GetMapping(path = "/driver/{id}")
	public Optional<Drivers> findDriverById(@PathVariable("id") int id)
	{
		return service.findDriverById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void deleteDriverById(@PathVariable("id") int id)
	{
		service.deleteDriver(id);
	}
	
	@GetMapping("/age")
	public Optional<Drivers> findDriverByAge(@RequestParam("age") int age)
	{
		return service.findByAge(age);
	}
	
	@GetMapping(path = "/drivers/{id}")
	public Optional<Drivers> findDriverByIdandAge(@PathVariable("id") int id,@RequestParam("age") int age)
	{
		return service.findDriverByIdAndAge(id,age);
	}
	
	//API to demonstrate @ResponseStatus
	@GetMapping(path = "/driverId/{id}")
	@ResponseStatus(HttpStatus.NOT_FOUND)  					//we can set any HttpStatus
	public Optional<Drivers> getDriverById(@PathVariable("id") int id)
	{
		Optional<Drivers> driver = service.findDriverById(id);
		return driver;
	}
	
	//API to demonstrate ResponseEntity
	@GetMapping(path = "/getDriver/{id}")
	public ResponseEntity<Object> getDriverInfoById(@PathVariable("id") int id)
	{
		return service.findDriver(id);
	}
	
	//API for setting URL in headers
	@PostMapping(path = "/addDriver")
	public ResponseEntity<Drivers> add(@RequestBody Drivers driver)
	{
		Drivers d = service.addDriver(driver);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()    //Provides URL(location) of this method in headers as a response 
						.path("/{addDriver}")
						.buildAndExpand(d.getDriverId())
						.toUri();
		return ResponseEntity.created(location).body(d);
	}
	
	//API to demonstrate @ExceptionHandler
	@GetMapping(path = "/fetchById/{id}")
	public Drivers fetchById(@PathVariable("id") int id)
	{
		Drivers d = service.findDriverByGivenId(id);
		return d;
	}
	
	//If driver with the given id found, returns custom response by Response entity else returns reponse by ExceptionHandler
	@GetMapping(path = "/fetchById/{id}")
	public ResponseEntity<Object> getById(@PathVariable("id") int id)
	{
		ResponseEntity<Object> d = service.getDriver(id);
		return d;
	}
	
	@GetMapping(path = "/driverById/{id}")
	public ResponseEntity<Optional<Drivers>> fetchDriverById(@PathVariable("id") int id) 
	{
		Optional<Drivers> driver = service.findDriverById(id);
	    if (driver == null)
	    {
	        return  ResponseEntity.notFound().build();				
	    	//throw new UserNotFoundException("Driver not found with id " + id);
	    }
	    else
	    {
	    	return new ResponseEntity<Optional<Drivers>>(driver, HttpStatus.OK);
	    	//return ResponseEntity.accepted().body(driver);			
	    }
	}
	 
}	

