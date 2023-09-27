package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Review implements Serializable {

	@SerializedName("review")
	private String review;

	@SerializedName("author")
	private String author;


	public Review(String review, String author) {
		this.review = review;
		this.author = author;
	}

	public String getReview(){
		return review;
	}

	public String getAuthor(){
		return author;
	}



	@Override
	public String toString() {
		return "Review{" +
				"review='" + review + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}