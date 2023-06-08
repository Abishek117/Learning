package com.example.demo.entity;


public class Drivers 
{
	private int driverId;
	private String driverName;
	private int age;
	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drivers(int driverId, String driverName, int age) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "Drivers [driverId=" + driverId + ", driverName=" + driverName + ", age=" + age + "]";
	}
	
}
