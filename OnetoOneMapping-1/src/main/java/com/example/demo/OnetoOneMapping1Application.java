package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@SpringBootApplication
public class OnetoOneMapping1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(OnetoOneMapping1Application.class, args);
		
		UserService us = ctx.getBean(UserService.class);
		
		User u = ctx.getBean(User.class);
		
		us.addEntity();
		//us.getEntity();
		//us.getByuserName("Nedumaaran");
		//us.remove("SuriyaKrishnan");
	}

}
