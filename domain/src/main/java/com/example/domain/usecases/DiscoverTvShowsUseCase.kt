package com.example.domain.usecases

import com.example.domain.repository.DiscoverRepository
import javax.inject.Inject

class DiscoverTvShowsUseCase @Inject constructor(
    private val discoverRepository: DiscoverRepository
) {
    suspend operator fun invoke() =
        discoverRepository.discoverTvShows()
}