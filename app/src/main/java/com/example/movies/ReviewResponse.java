package com.example.movies;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ReviewResponse implements Serializable {

	@SerializedName("docs")
	private List<Review> reviews;

	public ReviewResponse(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Review> getReviews(){
		return reviews;
	}

	@Override
	public String toString() {
		return "ReviewResponse{" +
				"reviews=" + reviews +
				'}';
	}
}