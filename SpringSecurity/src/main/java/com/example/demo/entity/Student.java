package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "Students_Registry")
public class Student 
{
	@Id
	@Column(name = "Id")
	int id;
	
	@Column(name = "Name")
	String name;
	
	@Column(name = "DOB")
	LocalDate dob;
	
	@Column(name = "Department")
	String department;
	
	@Column(name = "Batch")
	String batch;
	
	@Column(name = "Category")
	String Category;
	
	@Column(name = "HSC Passed")
	String hscPassed;


	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getMarks() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getHscPassed() {
		return hscPassed;
	}

	public void setHscPassed(String hscPassed) {
		this.hscPassed = hscPassed;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", department=" + department + ", batch="
				+ batch + ", Category=" + Category + ", hscPassed=" + hscPassed + "]";
	}

	
	
	
	
}
