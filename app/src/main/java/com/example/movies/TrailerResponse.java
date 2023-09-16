package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class TrailerResponse implements Serializable {

    @SerializedName("docs")
    private List<TrailerList> trailerLists;

    public TrailerResponse(List<TrailerList> trailerLists) {
        this.trailerLists = trailerLists;
    }

    public List<TrailerList> getTrailerLists() {
        return trailerLists;
    }

    @Override
    public String toString() {
        return "TrailerResponse{" +
                "trailerLists=" + trailerLists +
                '}';
    }
}
