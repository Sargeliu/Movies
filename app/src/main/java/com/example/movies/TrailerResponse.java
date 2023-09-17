package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class TrailerResponse implements Serializable {

    @SerializedName("docs")
    private Videos videos;

    public TrailerResponse(Videos videos) {
        this.videos = videos;
    }

    public Videos getVideos() {
        return videos;
    }

    @Override
    public String toString() {
        return "TrailerResponse{" +
                "videos=" + videos +
                '}';
    }
}
