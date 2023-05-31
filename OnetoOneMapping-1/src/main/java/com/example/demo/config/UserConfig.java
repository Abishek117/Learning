package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.User;
import com.example.demo.entity.UserProfile;

@Configuration
public class UserConfig 
{
	
	@Bean
	public User user()
	{
		User u = new User();
		u.setUsername("Rolex");
		u.setPassword("rolex17");
		return u;
	}
	
	@Bean
	public UserProfile userProfile()
	{
		UserProfile up = new UserProfile();
		up.setUserId(102);
		up.setName("Rolex");
		up.setAge(27);
		return up;
	}

}
