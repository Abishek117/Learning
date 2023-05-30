package com.example.demo.service;

import java.util.List;

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
		repo2.deleteById(1102);
		System.out.println("Removed");
	}
	
	public List<CustomerProfile> findAll()
	{
		List<CustomerProfile> cp = repo2.findAll();
		for(CustomerProfile custDetails : cp)
		{
			System.out.println("Profile ID : " + custDetails.getId());
			System.out.println("Customer Address : " + custDetails.getAddress());
			System.out.println("Secondary Number : " + custDetails.getSecondNumber());
			Customer c = custDetails.getCustomer();
			System.out.println("Customer ID : " + c.getCustomerId());
			System.out.println("Customer Name : " + c.getCustomerName());
			System.out.println("Primary Number : " + c.getPhoneNumber());		
			System.out.println("***************************");
		}
		return cp;
		
	}
	
	
	

}
