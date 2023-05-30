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
		d.setDriverId(106);
		d.setDriverName("Poovu");
		d.setAge(22);
		
		//ds.add(d);
		//System.out.println(ds.getById(102));
		//System.out.println(ds.getDrivers());
		//System.out.println(ds.deleteById(103));
		//System.out.println(ds.getByName("manoj"));
		
//		Drivers added = ds.add(d);
//		if(added != null && !added.equals(0))
//		{
//			System.out.println("one record added");
//		}
		
		//System.out.println(ds.addEntity(d));
		System.out.println(ds.updateAge(19, 103));
		
		
	}	
}
