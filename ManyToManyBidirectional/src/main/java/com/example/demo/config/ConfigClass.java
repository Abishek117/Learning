package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Artists;
import com.example.demo.entity.Movies;

@Configuration
public class ConfigClass 
{
	@Primary
	@Bean
	public Artists artist1()
	{
		Artists a1 = new Artists();
		a1.setId(101);
		a1.setName("Suriya");
		a1.setAge(47);
		return a1;	
	}
	
//	@Bean
//	public Artists artist2()
//	{
//		Artists a1 = new Artists();
//		a1.setId(102);
//		a1.setName("Vijay");
//		a1.setAge(48);
//		return a1;	
//	}
	
	@Bean
	public Movies movie1()
	{
		Movies m1 = new Movies();
		m1.setMovieId(1002);
		m1.setMovieName("Ayan");
		m1.setRating(9.8);
		return m1;
	}
	
	@Bean
	public Movies movie2()
	{
		Movies m1 = new Movies();
		m1.setMovieId(1003);
		m1.setMovieName("Aadhavan");
		m1.setRating(9.5);
		return m1;
	}
	
//	@Bean
//	public Movies movie3()
//	{
//		Movies m1 = new Movies();
//		m1.setMovieId(1004);
//		m1.setMovieName("Nerukku Ner");
//		m1.setRating(7.8);
//		return m1;
//	}
	
	
	
}
