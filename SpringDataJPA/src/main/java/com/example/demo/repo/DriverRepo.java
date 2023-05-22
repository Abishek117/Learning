package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Drivers;

import jakarta.transaction.Transactional;

@Repository
public interface DriverRepo extends JpaRepository<Drivers, Integer>
{
	ArrayList<Drivers> findByDriverName(String driverName);
	
	@Query(nativeQuery = true,value = "select driver_id from Drivers")
	public ArrayList<Integer> getByDriverId();
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true,value="update Drivers set age = :age where driver_id = :value")
	public void updateByAge(@Param("age") int age, @Param("value") int id);
}
