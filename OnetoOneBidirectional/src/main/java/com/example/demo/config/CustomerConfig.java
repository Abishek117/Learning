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
		c.setCustomerId(101);
		c.setCustomerName("Abi");
		c.setPhoneNumber(654789032);
		return c;
	}
	
	@Bean
	public CustomerProfile custProfile()
	{
		CustomerProfile cp = new CustomerProfile();
		cp.setId(1101);
		cp.setAddress("ALPT");
		cp.setSecondNumber(765434563);
		return cp;
	}
}

