package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ServiceClass;

@SpringBootApplication
public class OneToManyBidirectionalApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(OneToManyBidirectionalApplication.class, args);
		
		ServiceClass cs = ctx.getBean(ServiceClass.class);
		//cs.addEntity();
		//cs.getAll1();
		//cs.getAll2();
		//cs.remove();
	}

}
