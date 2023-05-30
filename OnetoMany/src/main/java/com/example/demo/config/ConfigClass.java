package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Author;
import com.example.demo.entity.Books;

@Configuration
public class ConfigClass
{
	@Bean
	public Author author()
	{
		Author a = new Author();
		a.setName("Sudha Kongara");
		a.setAge(36);
		return a;
	}
	
	@Bean
	public Books sooraraiPottru()
	{
		Books b1 = new Books(104,"Soorarai Pottru",9.9);
		return b1;
	}
	
	@Bean
	public Books irudhiSuttru()
	{
		Books b2 = new Books(105,"Irudhi Suttru",9.7);
		return b2;
	}
	
	

}
