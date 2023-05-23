package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmpDetails;

public interface EmpDetailsRepository extends JpaRepository<EmpDetails, Long>
{
	
}
