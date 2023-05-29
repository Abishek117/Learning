package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_profile")
public class CustomerProfile
{
	@Id
	@Column(name= "id")
	private int id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name  = "second_number")
	private long secondNumber;
	
	@OneToOne(mappedBy = "custProfile",cascade=CascadeType.ALL)
	private Customer customer;

	public CustomerProfile()
	{
		super();
	}

	public CustomerProfile(int id, String address, long secondNumber, Customer customer) {
		super();
		this.id = id;
		this.address = address;
		this.secondNumber = secondNumber;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(long secondNumber) {
		this.secondNumber = secondNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerProfile [id=" + id + ", address=" + address + ", secondNumber=" + secondNumber + ", customer="
				+ customer + "]";
	}
}
