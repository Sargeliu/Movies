package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("rating")

    private String rating;

    public Rating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}
