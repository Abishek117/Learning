package com.example.demo.config;

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

}
