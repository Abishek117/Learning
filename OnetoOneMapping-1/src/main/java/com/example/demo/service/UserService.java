package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.entity.UserProfile;
import com.example.demo.repo.UserRepository;

@Service
public class UserService 
{
	@Autowired
	UserRepository repo;
	
	@Autowired
	User user;
	
	@Autowired
	UserProfile userProfile;
	
	public void addEntity()
	{
		user.setUserProfile(userProfile);
		repo.save(user);
		System.out.println("Added");
	}
	
	public void getEntity()
	{
		System.out.println(repo.findAll());
	}
	
	public void getByuserName(String username)
	{
		System.out.println(repo.findByUsername(username));
	}
	
	public void remove(String name)
	{
		this.repo.deleteByUsername(name);
		System.out.println("removed");
	}
	
}
