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
		d.setDriverId(104);
		d.setDriverName("kumar");
		d.setAge(23);
		
		System.out.println(ds.add(d));
		//System.out.println(ds.getId(102));
		//System.out.println(ds.getDrivers());
		//ds.delete(10432);
		
		
//		Drivers added = ds.add(d);
//		
//		if(added != null && !added.equals(0))
//		{
//			System.out.println("one record added");
//		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
