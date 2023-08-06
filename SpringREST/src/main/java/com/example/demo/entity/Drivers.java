package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Component
@Entity
@Table(name = "Drivers")
public class Drivers 
{
	@Id
	@Column(name = "driver_id")
	@Positive(message = "Id shoud be greater than Zero")
	private int driverId;
	
	@Column(name = "driver_name")
	@Size(min = 2,message = "Name should have atleast 2 characters")
	private String driverName;
	
	@Column(name = "age")
	@Positive(message="Age should be greater than Zero")
	private int age;
	
	public Drivers() 
	{
		super();
	}
	
	public Drivers(int driverId, String driverName, int age) 
	{
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.age = age;
	}
	
	public int getDriverId()
	{
		return driverId;
	}
	
	public void setDriverId(int driverId)
	{
		this.driverId = driverId;
	}
	
	public String getDriverName() 
	{
		return driverName;
	}
	
	public void setDriverName(String driverName)
	{
		this.driverName = driverName;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Drivers [driverId=" + driverId + ", driverName=" + driverName + ", age=" + age + "]";
	}
	
}
