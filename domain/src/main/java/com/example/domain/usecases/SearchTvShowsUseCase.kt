package com.example.domain.usecases

import com.example.domain.repository.SearchRepository
import javax.inject.Inject

class SearchTvShowsUseCase @Inject constructor(
    private val searchRepository: SearchRepository
) {
    suspend operator fun invoke(searchParams: String) =
        searchRepository.searchTvShows(searchParams)
}