package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.CustomerService;

@SpringBootApplication
public class OnetoOneBidirectionalApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(OnetoOneBidirectionalApplication.class, args);
		
		CustomerService cs = ctx.getBean(CustomerService.class);
		
		//cs.addEntity();
		//cs.remove();
		//cs.findAll();
		cs.getAll();
	}

}
