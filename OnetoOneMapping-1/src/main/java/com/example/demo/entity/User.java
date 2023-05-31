package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="user_01")
public class User 
{
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "profile_id")
	private UserProfile userProfile;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, UserProfile userProfile) {
		super();
		this.username = username;
		this.password = password;
		this.userProfile = userProfile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userProfile=" + userProfile + "]";
	}
	
	
	
}
