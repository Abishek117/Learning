package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Drivers;

public interface DriverRepo extends CrudRepository<Drivers, Integer>
{

}
