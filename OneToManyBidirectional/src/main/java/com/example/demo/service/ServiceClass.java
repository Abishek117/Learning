package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.entity.Employees;
import com.example.demo.repo.CompanyRepository;
import com.example.demo.repo.EmployeeRepository;

@Service
public class ServiceClass 
{
	
	@Autowired
	CompanyRepository repo1;
	
	@Autowired
	EmployeeRepository  repo2;
	
	@Autowired
	Company company;
	
	@Autowired
	List<Employees> employees;
	
	public void addEntity()
	{
		repo1.save(company);
		for(Employees employee : employees)
		{
			employee.setCompany(company);
			repo2.save(employee);
		}

		System.out.println("Added");
	}
	
	//accessing Company from Employees
	public List<Employees> getAll1()
	{
		List<Employees> emp = repo2.findAll();
		for(Employees employee : emp)
		{
			System.out.println("************");
			System.out.println("Employee name : " + employee.getName());
			System.out.println("Employee ID : " + employee.getEmpId());
			Company c = employee.getCompany();
			System.out.println("Branch : " + c.getBranch());
			//System.out.println("************");
		}
		return emp;
	}
	
	//accessing Employees from Company
	public List<Company> getAll2()
	{
		List<Company> c = repo1.findAll();
		for(Company company : c)
		{
			//System.out.println("************");
			System.out.println("Company Name : " + company.getName());
			System.out.println("Branch : " + company.getBranch());
			List<Employees> emp = company.getEmployees();
			for(Employees employee : emp)
			{
				System.out.println("Employee name : " + employee.getName());
			}
			
		}
		return c;
	}
	
	
	public void remove()
	{
		repo2.deleteById(102);
		System.out.println("Deleted");
	}
	

}
