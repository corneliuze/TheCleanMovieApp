package com.example.domain.repository

import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import kotlinx.coroutines.flow.Flow

interface DiscoverMovieRepository {

    suspend fun discoverMovies() : Flow<List<MovieModel>>

    suspend fun discoverTvShows() : Flow<List<TVShowModel>>

}