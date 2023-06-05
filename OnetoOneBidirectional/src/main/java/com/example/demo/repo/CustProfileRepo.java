package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerProfile;

@Repository
public interface CustProfileRepo extends JpaRepository<CustomerProfile, Integer> 
{
	@Query(nativeQuery = true , value = "select id from customer_profile")
	public ArrayList<Integer> getProfileID(int id);

}
