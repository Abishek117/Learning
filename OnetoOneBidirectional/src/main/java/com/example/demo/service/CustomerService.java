package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerProfile;
import com.example.demo.repo.CustProfileRepo;
import com.example.demo.repo.CustomerRepo;

@Service
public class CustomerService
{
	@Autowired
	CustomerRepo repo1;
	
	@Autowired
	CustProfileRepo repo2;
	
	@Autowired
	Customer cust;
	
	@Autowired
	CustomerProfile custProfile;
	
	public void addEntity()
	{
		repo2.save(custProfile);
		cust.setCustProfile(custProfile);
		repo1.save(cust);
		System.out.println("Added");
	}
	
	public void remove()
	{
		repo1.deleteById(102);
		System.out.println("Removed");
	}
	
	
	

}
