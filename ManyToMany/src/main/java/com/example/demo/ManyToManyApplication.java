package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.services.ServiceClass;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(ManyToManyApplication.class, args);
		
		ServiceClass sc = ctx.getBean(ServiceClass.class);
		
		sc.addEntity();
		//System.out.println(sc.getAll());
		//System.out.println(sc.getById());
		//System.out.println(sc.getbyCourseId());
		//sc.removeUsers();
		
	}
	
	

}
