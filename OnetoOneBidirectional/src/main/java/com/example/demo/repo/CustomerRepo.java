package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{
	
	@Query(nativeQuery = true , value = "select cust_id from customer_17")
	public ArrayList<Integer> getCustomerID(int id);
}
