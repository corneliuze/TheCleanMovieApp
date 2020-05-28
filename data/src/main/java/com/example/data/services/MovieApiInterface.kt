package com.example.data.services

import retrofit2.http.GET

interface MovieApiInterface {
    @GET
    suspend fun discoverMovies()

    @GET
    suspend fun discoverTvShows()

    @GET
    suspend fun searchMovies()

    @GET
    suspend fun searchTvShows()
}