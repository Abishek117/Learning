package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "University")
public class University 
{
	@Id
	@Column(name = "university_code")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "Location")
	private String Location;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
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

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", Location=" + Location + "]";
	}
	
}
