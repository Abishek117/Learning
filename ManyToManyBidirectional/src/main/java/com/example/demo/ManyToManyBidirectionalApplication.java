package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ServiceClass;

@SpringBootApplication
public class ManyToManyBidirectionalApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(ManyToManyBidirectionalApplication.class, args);
		ServiceClass sc = ctx.getBean(ServiceClass.class);
		sc.addEntity();
	}

}
