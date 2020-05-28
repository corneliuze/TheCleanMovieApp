package com.example.data.repository

import com.example.data.models.responses.MovieModelResponse
import com.example.data.models.responses.TVShowModelResponse
import com.example.domain.repository.SearchMovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMovieRepositoryImpl @Inject constructor(
    private val searchMovieRepositoryImpl: SearchMovieRepositoryImpl
) : SearchMovieRepository {

    override suspend fun searchMovies(params: String): Flow<List<MovieModelResponse>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun searchTvShows(params: String): Flow<List<TVShowModelResponse>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}