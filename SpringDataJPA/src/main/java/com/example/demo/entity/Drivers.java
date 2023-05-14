package com.example.demo.entity;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Drivers")
@Component
public class Drivers
{
	@Id
	@Column(name = "driver_id")
	private int driverId;
	
	@Column(name = "driver_name")
	private String driverName;
	
	@Column(name = "age")
	private int age;

	
	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public Drivers(int driverId, String driverName, int age) {
//		super();
//		this.driverId = driverId;
//		this.driverName = driverName;
//		this.age = age;
//	}

	public Drivers() {
		super();
		System.out.println("Injected.");
	}
	
	

}
