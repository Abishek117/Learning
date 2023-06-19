package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Drivers;
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
	public Optional<Drivers> findDriver(@PathVariable("id") int id)
	{
		return service.findDriverById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void deleteById(@PathVariable("id") int id)
	{
		service.deleteDriver(id);
	}
	
	@GetMapping("/age")
	public Optional<Drivers> findByAge(@RequestParam("age") int age)
	{
		return service.findByAge(age);
	}
	
	@GetMapping(path = "/drivers/{id}")
	public Optional<Drivers> findDriverIdandAge(@PathVariable("id") int id,@RequestParam("age") int age)
	{
		return service.findDriverByIdAndAge(id,age);
	}
	

	@GetMapping(path = "/driverId/{id}")
	@ResponseStatus(HttpStatus.PAYLOAD_TOO_LARGE)  					//we can set any HttpStatus
	public Optional<Drivers> findDriverById(@PathVariable("id") int id)
	{
		Optional<Drivers> driver = service.findDriverById(id);
		return driver;
	}
	
	
	@GetMapping("/driverById/{id}")
	public ResponseEntity<Optional<Drivers>> getDriverById(@PathVariable("id") int id) 
	{
		Optional<Drivers> driver = service.findDriverById(id);
	    if (driver == null)
	    {
	        
	        return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();	// Return 404 Not Found
	    } 
	    else 
	    {
	    	return ResponseEntity.ok(driver); 			// Return 200 OK with the user object
	    }
	}
	
}	

