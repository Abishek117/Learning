package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Author;
import com.example.demo.entity.Books;
import com.example.demo.services.ServiceClass;

@SpringBootApplication
public class OnetoManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(OnetoManyApplication.class, args);
		
		ServiceClass sc = ctx.getBean(ServiceClass.class);
		
		sc.addEntity();
		//System.out.println(sc.getByName());
		//System.out.println(sc.getAll());
		//sc.removeEntity();
		
	}

}
