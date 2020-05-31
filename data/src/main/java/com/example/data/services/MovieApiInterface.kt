package com.example.data.services

import com.example.data.models.responses.MovieModelResponse
import com.example.data.models.responses.TVShowModelResponse
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("")
    suspend fun discoverMovies()  : List<MovieModelResponse>

    @GET("")
    suspend fun discoverTvShows() : List<TVShowModelResponse>

    @GET("")
    suspend fun searchMovies() : List<MovieModelResponse>

    @GET("")
    suspend fun searchTvShows() : List<TVShowModelResponse>
}