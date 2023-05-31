package com.example.demo.entity;

import org.hibernate.annotations.ManyToAny;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//@Component
@Entity
@Table(name = "employees")
public class Employees
{
	@Id
	@Column(name = "emp_id")
	private int empId;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "role")
	private String role;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int empId, String name, String role, Company company) {
		super();
		this.empId = empId;
		this.name = name;
		this.role = role;
		this.company = company;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", name=" + name + ", role=" + role + ", company=" + company + "]";
	}
}
