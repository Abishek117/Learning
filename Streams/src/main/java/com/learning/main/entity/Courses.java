package com.learning.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses 
{
	@Id
	@Column(name = "course_id")
	private int course_id;
	
	@Column(name = "course_name")
	private String course_name;
	
	@Column(name = "price")
	private double price;

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courses(int course_id, String course_name, double price) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.price = price;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Courses [course_id=" + course_id + ", course_name=" + course_name + ", price=" + price + "]";
	}
}
