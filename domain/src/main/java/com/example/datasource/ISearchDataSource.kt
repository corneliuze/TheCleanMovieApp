package com.example.datasource

import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import kotlinx.coroutines.flow.Flow

interface ISearchDataSource {

    suspend fun searchMovies(): Flow<List<MovieModel>>

    suspend fun searchTvShows(): Flow<List<TVShowModel>>
}