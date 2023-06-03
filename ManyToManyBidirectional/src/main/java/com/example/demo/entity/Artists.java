package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Artists")
public class Artists 
{
	@Id
	@Column(name = "artist_id")
	private int id;
	
	@Column(name = "artist_name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "artists_and_movies",
				joinColumns = @JoinColumn(name = "artist_id"),
				inverseJoinColumns = @JoinColumn(name = "movie_id"))
	private List<Movies> movies;

	public Artists() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artists(int id, String name, int age, List<Movies> movies) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.movies = movies;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Artists [id=" + id + ", name=" + name + ", age=" + age + ", movies=" + movies + "]";
	}

}
