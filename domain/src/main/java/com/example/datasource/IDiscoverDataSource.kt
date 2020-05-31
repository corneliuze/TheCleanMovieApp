package com.example.datasource

import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import kotlinx.coroutines.flow.Flow

interface IDiscoverDataSource {

    suspend fun getDiscoveredMovies(): Flow<List<MovieModel>>

    suspend fun getDiscoveredTvShows(): Flow<List<TVShowModel>>

}