package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Drivers;

@Repository
public interface DriverRepo extends JpaRepository<Drivers, Integer>
{
	@Query(nativeQuery =  true,value = "select * from drivers where driver_id = :id and age = :age")
	public Optional<Drivers> findByDriverIdAndAge(@Param("id")int id,@Param("age") int age);

	@Query(nativeQuery = true,value = "select * from drivers where age = :age")
	public Optional<Drivers> findDriverByAge(@Param("age") int age);
	
}
