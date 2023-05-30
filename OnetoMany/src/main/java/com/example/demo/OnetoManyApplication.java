package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.services.ServiceClass;

@SpringBootApplication
public class OnetoManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(OnetoManyApplication.class, args);
		
		ServiceClass sc = ctx.getBean(ServiceClass.class);
		
		//sc.addEntity();
		//sc.getById();
		sc.removeEntity();
	}

}
