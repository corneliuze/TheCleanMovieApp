package com.example.data.mappers


import com.example.data.models.responses.MovieModelResponse
import com.example.data.models.responses.TVShowModelResponse
import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel

internal fun List<MovieModelResponse>.toMovieDomain(): List<MovieModel> {
    return map {
        MovieModel(
            it.backdropPath,
            it.id,
            it.originalTitle,
            it.overview,
            it.posterPath,
            it.title
        )
    }
}

internal fun List<TVShowModelResponse>.toTvShowDomain(): List<TVShowModel> {
    return map {
        TVShowModel(
            it.backdropPath,
            it.id,
            it.name,
            it.originalName,
            it.overview,
            it.posterPath
        )
    }
}

