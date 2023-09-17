package com.example.movies;

import android.provider.MediaStore;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Videos implements Serializable {

    @SerializedName("videos")
    private TrailerList trailerList;

    public Videos(TrailerList trailerList) {
        this.trailerList = trailerList;
    }

    public TrailerList getTrailerList() {
        return trailerList;
    }

    @Override
    public String toString() {
        return "Videos{" +
                "trailerList=" + trailerList +
                '}';
    }
}
