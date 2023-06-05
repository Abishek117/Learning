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
		a.setName("Lokesh Kanagaraj");
		a.setAge(32);
		return a;
	}

//	@Bean
//	public Books kaidhi()
//	{
//		Books b1 = new Books(106,"Kaidhi",9.9);
//		return b1;
//	}
//	
//	@Bean
//	public Books maanagaram()
//	{
//		Books b2 = new Books(107,"Maanagaram",9.7);
//		return b2;
//	}
//
//	@Bean
//	public Books vikram()
//	{
//		Books b3 = new Books(108,"Vikram",9.8);
//		return b3;
//	}
//	
	@Bean
	public Books master()
	{
		Books b3 = new Books(109,"master",9.5);
		return b3;
	}
	
	@Bean
	public Books leo()
	{
		Books b3 = new Books(110,"Leo",9.5);
		return b3;
	}
	
	@Bean
	public Books steelClaws()
	{
		Books b3 = new Books(111,"SteelClaws",9.8);
		return b3;
	}
	
	

}
