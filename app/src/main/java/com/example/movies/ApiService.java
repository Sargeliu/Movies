package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=6H5E8VR-C8AME3F-NT73Q1F-GRX4DZV&field=rating.kp&search=4-10&sortField=votes" +
            ".kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=6H5E8VR-C8AME3F-NT73Q1F-GRX4DZV&field=id")
    Single<TrailerResponse> loadResponse(@Query("search") int id);
}
