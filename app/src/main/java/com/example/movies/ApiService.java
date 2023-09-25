package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {
    @GET("v1.3/movie?token=6H5E8VR-C8AME3F-NT73Q1F-GRX4DZV&field=rating.kp&search=4-10&sortField=votes" +
            ".kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("v1.3/movie?token=6H5E8VR-C8AME3F-NT73Q1F-GRX4DZV&selectFields=videos&sortField=videos.trailers.url&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("v1/review?token=6H5E8VR-C8AME3F-NT73Q1F-GRX4DZV&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}
