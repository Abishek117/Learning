package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movies 
{
	@Id
	@Column(name = "movie_id")
	private int movieId;
	
	@Column(name = "movie_name")
	private String movieName;
	
	@Column(name = "rating")
	private double rating;
	
	@ManyToMany(mappedBy = "movies",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Artists> artists;

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies(int movieId, String movieName, double rating, List<Artists> artists) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
		this.artists = artists;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<Artists> getArtists() {
		return artists;
	}

	public void setArtists(List<Artists> artists) {
		this.artists = artists;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + ", artists=" + artists
				+ "]";
	}
	
}
