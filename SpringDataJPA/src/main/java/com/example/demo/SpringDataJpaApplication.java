package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Drivers;
import com.example.demo.service.DriverService;


@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx =  SpringApplication.run(SpringDataJpaApplication.class, args);
		DriverService ds = ctx.getBean(DriverService.class);
		Drivers d = ctx.getBean(Drivers.class);
		d.setDriverId(101);
		d.setDriverName("Abi");
		d.setAge(23);
		
		ds.add(d);
	}
	
	
	
	
}
