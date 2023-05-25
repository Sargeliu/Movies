package com.example.movies;

public class Movie {

    private int id;
    private int year;
    private String name;
    private String description;
    private Poster poster;
    private Rating rating;

    public Movie(int id, int year, String name, String description, Poster poster, Rating rating) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.description = description;
        this.poster = poster;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Poster getPoster() {
        return poster;
    }

    public Rating getRating() {
        return rating;
    }
}
