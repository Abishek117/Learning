package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_17")
public class Customer 
{
	@Id
	@Column(name = "cust_id")
	private int customerId;
	
	@Column(name = "cust_name")
	private String customerName;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	//@OneToOne(mappedBy = "customer",cascade=CascadeType.ALL)
	@OneToOne
	@JoinColumn(name = "profile_id",referencedColumnName = "id")
	private CustomerProfile custProfile;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, long phoneNumber, CustomerProfile custProfile) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.custProfile = custProfile;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public CustomerProfile getCustProfile() {
		return custProfile;
	}

	public void setCustProfile(CustomerProfile custProfile) {
		this.custProfile = custProfile;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", custProfile=" + custProfile + "]";
	}
	
	
	
}
