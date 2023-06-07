package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Drivers;
import com.example.demo.service.DriverService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		
		DriverService ds = ctx.getBean(DriverService.class);
		
		Drivers d = ctx.getBean(Drivers.class);
		
		//System.out.println(ds.add(d));
		//System.out.println(ds.findAll());
		//System.out.println(ds.findById(d.getDriverId()));
		//System.out.println(ds.update(d));
		//System.out.println(ds.remove(d.getDriverId()));
		//System.out.println(ds.getAllDrivers());
		System.out.println(ds.getAllDriversName());
	}

}
