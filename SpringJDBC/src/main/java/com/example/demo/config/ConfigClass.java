package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Drivers;

@Configuration
public class ConfigClass 
{
	@Bean
	public Drivers driver1()
	{
		Drivers d = new Drivers(107,"Ram",47);
		return d;
	}
	
	public List<Drivers> drivers()
	{
		List<Drivers> list = new ArrayList<>();
		Drivers d1 = new Drivers(109,"abc",20);
		list.add(d1);
		Drivers d2 = new Drivers(110,"xyz",18);
		list.add(d2);
		return list;
	}
}
