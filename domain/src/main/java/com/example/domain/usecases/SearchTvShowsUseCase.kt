package com.example.domain.usecases

import com.example.domain.repository.SearchMovieRepository
import javax.inject.Inject

class SearchTvShowsUseCase @Inject constructor(
    private val searchMovieRepository: SearchMovieRepository
) {
    suspend operator fun invoke(searchParams: String) =
        searchMovieRepository.searchTvShows(searchParams)
}