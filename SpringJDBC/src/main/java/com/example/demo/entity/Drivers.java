package com.example.demo.entity;


public class Drivers 
{
	private int driverId;
	private String name;
	private int age;
	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drivers(int driverId, String name, int age) {
		super();
		this.driverId = driverId;
		this.name = name;
		this.age = age;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Drivers [driverId=" + driverId + ", name=" + name + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
