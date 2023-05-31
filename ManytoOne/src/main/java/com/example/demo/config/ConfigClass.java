package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.Entity.Students;
import com.example.demo.Entity.University;

@Configuration
public class ConfigClass
{
	
	
	//@Primary
	@Bean
	public Students stud1()
	{
		Students s1 = new Students();
		s1.setId(101);
		s1.setName("Abishek");
		s1.setMarks(77.00);
		return s1;
	}
	@Primary
	@Bean
	public Students stud2()
	{
		Students s2 = new Students();
		s2.setId(103);
		s2.setName("Hari");
		s2.setMarks(85.00);
		return s2;
	}
	
	@Bean
	public University univ()
	{
		University u = new University();
		u.setId(1101);
		u.setName("Anna University");
		u.setLocation("Chennai");
		return u;
	}

}
