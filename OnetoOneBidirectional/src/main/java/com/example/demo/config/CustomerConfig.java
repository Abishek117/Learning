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
		c.setCustomerId(103);
		c.setCustomerName("Hari");
		c.setPhoneNumber(887805674);
		return c;
	}
	
	@Bean
	public CustomerProfile custProfile()
	{
		CustomerProfile cp = new CustomerProfile();
		cp.setId(1103);
		cp.setAddress("ALPT");
		cp.setSecondNumber(876833456);
		return cp;
	}
}

