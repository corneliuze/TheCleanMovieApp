package com.example.data.repository


import com.example.data.source.SearchDataSourceImpl
import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import com.example.domain.repository.SearchRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val searchDataSourceImpl: SearchDataSourceImpl
) : SearchRepository {

    override suspend fun searchMovies(params: String): Flow<List<MovieModel>> {
        return searchDataSourceImpl.searchMovies()
    }

    override suspend fun searchTvShows(params: String): Flow<List<TVShowModel>> {
        return searchDataSourceImpl.searchTvShows()
    }

}