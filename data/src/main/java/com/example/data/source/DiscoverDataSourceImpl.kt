package com.example.data.source

import com.example.data.ext.toFlow
import com.example.data.mappers.toMovieDomain
import com.example.data.mappers.toMovieEntity
import com.example.data.mappers.toTvShowDomain
import com.example.data.mappers.toTvShowEntity
import com.example.data.models.entities.MovieEntity
import com.example.data.models.entities.TVShowEntity
import com.example.data.services.MovieApiInterface
import com.example.datasource.IDiscoverDataSource
import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DiscoverDataSourceImpl @Inject constructor(
    private val movieApiInterface: MovieApiInterface
) : IDiscoverDataSource {

    override suspend fun getDiscoveredMovies(): Flow<List<MovieModel>> {
        return toFlow(movieApiInterface.discoverMovies().toMovieDomain())
    }

    override suspend fun getDiscoveredTvShows(): Flow<List<TVShowModel>> {
        return toFlow(movieApiInterface.discoverTvShows().toTvShowDomain())
    }

}