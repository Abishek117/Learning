package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.EmpDetails;
import com.example.demo.entity.Employee;

@Configuration
public class ConfigClass
{
	
	@Bean
	public Employee employee()
	{
		Employee e = new Employee();
		e.setEmpId(102);
		e.setEmpName("Chandru");
		e.setAge(25);
		return e;	
	}
	
	@Bean
	public EmpDetails empDetails()
	{
		EmpDetails ed = new EmpDetails();
		ed.setId(756891);
		ed.setName("Chandru");
		ed.setType("Aadhaar");
		return ed;
	}

}
