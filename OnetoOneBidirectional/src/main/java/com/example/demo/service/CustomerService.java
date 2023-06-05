package com.example.demo.service;

import java.util.ArrayList;
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
		ArrayList<Integer> arr1 = repo2.getProfileID(102);
		ArrayList<Integer> arr2 = repo1.getCustomerID(102);
		if(arr2.contains(cust.getCustomerId()) && arr1.contains(custProfile.getId()))
		{
			System.out.println("ID already exists...");
		}
		else
		{
		repo2.save(custProfile);
		cust.setCustProfile(custProfile);
		repo1.save(cust);
		System.out.println("Added");
		}
	}
	
	public void remove()
	{
		repo2.deleteById(1102);
		System.out.println("Removed");
	}
	
	
	//accessing customer from customer profile
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
	
	//accessing customer profile from customer
	public List<Customer> getAll()
	{
		List<Customer> c = repo1.findAll();
		for(Customer customer : c)
		{
			System.out.println("Customer ID : " + customer.getCustomerId());
			System.out.println("Customer Name : " + customer.getCustomerName());
			System.out.println("Primary Number : " + customer.getPhoneNumber());
			
			CustomerProfile custDetails = customer.getCustProfile();
			
			System.out.println("Profile ID : " + custDetails.getId());
			System.out.println("Customer Address : " + custDetails.getAddress());
			System.out.println("Secondary Number : " + custDetails.getSecondNumber());
			System.out.println("***************************");
			
		}
		return c;
	}
	
	
	
	

}
