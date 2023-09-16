package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TrailerList implements Serializable {

    @SerializedName("videos")
    private Videos videos;

    public TrailerList(Videos videos) {
        this.videos = videos;
    }

    public Videos getVideos() {
        return videos;
    }

    @Override
    public String toString() {
        return "TrailerList{" +
                "videos=" + videos +
                '}';
    }
}
