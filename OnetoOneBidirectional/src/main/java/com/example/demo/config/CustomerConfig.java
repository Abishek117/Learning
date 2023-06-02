package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerProfile;

@Configuration
public class CustomerConfig 
{
	@Bean
	public Customer cust()
	{
		Customer c = new Customer();
		c.setCustomerId(102);
		c.setCustomerName("Manoj");
		c.setPhoneNumber(99805674);
		return c;
	}
	
	@Bean
	public CustomerProfile custProfile()
	{
		CustomerProfile cp = new CustomerProfile();
		cp.setId(1102);
		cp.setAddress("ALPT");
		cp.setSecondNumber(666833456);
		return cp;
	}
}

