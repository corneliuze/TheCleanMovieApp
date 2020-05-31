package com.example.data.repository


import com.example.data.source.DiscoverDataSourceImpl
import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel
import com.example.domain.repository.DiscoverRepository
import kotlinx.coroutines.flow.Flow

class DiscoverRepositoryImpl(
    private val discoverDataSourceImpl: DiscoverDataSourceImpl
) : DiscoverRepository {

    override suspend fun discoverMovies(): Flow<List<MovieModel>> {
        return discoverDataSourceImpl.getDiscoveredMovies()
    }

    override suspend fun discoverTvShows(): Flow<List<TVShowModel>> {
        return discoverDataSourceImpl.getDiscoveredTvShows()
    }

}