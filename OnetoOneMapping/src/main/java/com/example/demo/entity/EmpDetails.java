package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "IDProofs")
public class EmpDetails 
{
	@Id
	@Column(name = "id_number")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "id_type")
	private String type;

	public EmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDetails(long id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
