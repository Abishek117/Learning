package com.example.demo.entity;


import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//@Component
@Entity
@Table(name = "Company")
public class Company 
{
	@Id
	@Column(name = "company_code")
	private int companyCode;
	
	@Column(name = "company_name")
	private String name;
	
	@Column(name = "branch")
	private String branch;
	
	@OneToMany(mappedBy = "company",fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Employees> employees;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int companyCode, String name, String branch, List<Employees> employees) {
		super();
		this.companyCode = companyCode;
		this.name = name;
		this.branch = branch;
		this.employees = employees;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", name=" + name + ", branch=" + branch + ", employees="
				+ employees + "]";
	}

	
	
}
