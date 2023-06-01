package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Company;
import com.example.demo.entity.Employees;

@Configuration
public class ConfigClass 
{
	@Bean
	public Company company()
	{
		Company c1 = new Company();
		c1.setCompanyCode(1101);
		c1.setName("Alphon");
		c1.setBranch("USA");
		return c1;
	}
	
	@Bean
	public Employees employee1()
	{
		Employees e1 = new Employees();
		e1.setEmpId(103);
		e1.setName("abc");
		e1.setRole("Tester");
		return e1;
	}
	
	@Bean
	public Employees employee2()
	{
		Employees e2 = new Employees();
		e2.setEmpId(104);
		e2.setName("xyz");
		e2.setRole("BA");
		return e2;
	}
}
