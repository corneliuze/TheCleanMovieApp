package com.example.data.source

import com.example.data.ext.toFlow
import com.example.data.mappers.toMovieDomain
import com.example.data.mappers.toTvShowDomain
import com.example.data.services.MovieApiInterface
import com.example.datasource.ISearchDataSource
import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchDataSourceImpl @Inject constructor(
    private val movieApiInterface: MovieApiInterface
) : ISearchDataSource {

    override suspend fun searchMovies(): Flow<List<MovieModel>> {
        return toFlow(movieApiInterface.searchMovies().toMovieDomain())
    }

    override suspend fun searchTvShows(): Flow<List<TVShowModel>> {
        return toFlow(movieApiInterface.searchTvShows().toTvShowDomain())
    }

}