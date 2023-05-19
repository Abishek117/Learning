package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Drivers")
@Component
public class Drivers
{
	@Id
	@Column(name = "driver_id")
	private int id;
	
	@Column(name = "driver_name")
	private String name;
	
	@Column(name = "age")
	private int age;

}
