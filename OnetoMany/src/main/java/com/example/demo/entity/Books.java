package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Books 
{
	@Id
	@Column(name = "book_id")
	private int bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "rating")
	private double rating;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(int bookId, String bookName, double rating) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.rating = rating;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", rating=" + rating + "]";
	}

}
