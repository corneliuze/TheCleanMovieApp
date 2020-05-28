package com.example.domain.usecases

import com.example.domain.repository.DiscoverMovieRepository
import javax.inject.Inject

class DiscoverTvShowsUseCase @Inject constructor(
    private val discoverMovieRepository: DiscoverMovieRepository
) {
    suspend operator fun invoke() =
        discoverMovieRepository.discoverTvShows()
}