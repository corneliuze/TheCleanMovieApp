package com.example.presentation.mappers

import com.example.presentation.uimodels.MovieUiModel
import com.example.presentation.uimodels.TVShowUiModel
import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel


internal fun List<MovieModel>.toMovieUiModel(): List<MovieUiModel> {
    return map {
        MovieUiModel(
            it.backdropPath,
            it.id,
            it.originalTitle,
            it.overview,
            it.posterPath,
            it.title
        )
    }
}

internal fun List<TVShowModel>.toTvShowUiModel(): List<TVShowUiModel> {
    return map {
        TVShowUiModel(
            it.backdropPath,
            it.id,
            it.name,
            it.originalName,
            it.overview,
            it.posterPath
        )
    }
}