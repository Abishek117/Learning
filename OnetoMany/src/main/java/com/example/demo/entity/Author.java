package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Author")
public class Author 
{
	@Id 
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@OneToMany(targetEntity = Books.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "ref_id")
	private List<Books> books;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String name, int age, List<Books> books) {
		super();
		this.name = name;
		this.age = age;
		this.books = books;
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

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", books=" + books + "]";
	}
	
}
