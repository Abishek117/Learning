package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Drivers;

@Repository
public interface DriverRepo extends JpaRepository<Drivers, Integer>
{
	
}
