package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserProfile")
public class UserProfile 
{
	@Id
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;

	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfile(int userId, String name, int age) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
