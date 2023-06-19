package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Drivers;
import com.example.demo.repo.DriverRepo;
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
	
}	

