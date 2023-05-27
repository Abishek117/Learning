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
		e.setEmpId(107);
		e.setEmpName("Aathreya");
		e.setAge(27);
		return e;	
	}
	
	@Bean
	public EmpDetails empDetails()
	{
		EmpDetails ed = new EmpDetails();
		ed.setId(75689123);
		ed.setName("Aathreya");
		ed.setType("Aadhaar");
		return ed;
	}

}
