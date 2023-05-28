package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerProfile;

@Repository
public interface CustProfileRepo extends JpaRepository<CustomerProfile, Integer> 
{

}
