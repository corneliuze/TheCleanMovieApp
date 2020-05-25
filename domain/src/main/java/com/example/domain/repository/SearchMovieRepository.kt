package com.example.domain.repository

import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import kotlinx.coroutines.flow.Flow

interface SearchMovieRepository {

    suspend fun searchMovies(params: String) : Flow<List<MovieModel>>

    suspend fun searchTvShows(params : String) : Flow<List<TVShowModel>>

}