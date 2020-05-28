package com.example.data.repository

import com.example.data.source.DiscoverMovieDataSource
import com.example.data.models.responses.MovieModelResponse
import com.example.data.models.responses.TVShowModelResponse
import com.example.domain.repository.DiscoverMovieRepository
import kotlinx.coroutines.flow.Flow

class DiscoverMovieRepositoryImpl(
    private val discoverMovieDataSource: DiscoverMovieDataSource
) : DiscoverMovieRepository {

    override suspend fun discoverMovies(): Flow<List<MovieModelResponse>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun discoverTvShows(): Flow<List<TVShowModelResponse>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}