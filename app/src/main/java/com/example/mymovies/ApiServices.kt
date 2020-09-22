package com.example.moviesappinkotlin

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey : String = "22e0ea77fd2d07a9d354e0543dad692f",
        @Query("page") pageNumber: Int = 1
    ) : Call<MoviesResponse>
}