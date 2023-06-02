package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Users;

@Configuration
public class ConfigClass
{
	
	@Bean
	public Users user1()
	{
		Users u = new Users();
		u.setId(101);
		u.setName("Abi");
		u.setType("Student");
		return u;
	}
	
	
	@Bean
	public Users user2()
	{
		Users u = new Users();
		u.setId(102);
		u.setName("Manoj");
		u.setType("Working");
		return u;
	}
	
	@Primary
	@Bean
	public Users user3()
	{
		Users u = new Users();
		u.setId(103);
		u.setName("Hari");
		u.setType("Student");
		return u;
	}
	
	
	@Bean
	public Courses course1()
	{
		Courses c = new Courses();
		c.setCourse_id(1001);
		c.setCourse_name("Java");
		c.setPrice(100.00);
		return c;
	}
	
	@Bean
	public Courses course2()
	{
		Courses c = new Courses();
		c.setCourse_id(1002);
		c.setCourse_name("Python");
		c.setPrice(200.00);
		return c;
	}
	
	@Bean
	public Courses course3()
	{
		Courses c = new Courses();
		c.setCourse_id(1004);
		c.setCourse_name("Data Structures");
		c.setPrice(300.00);
		return c;
	}
	

}
