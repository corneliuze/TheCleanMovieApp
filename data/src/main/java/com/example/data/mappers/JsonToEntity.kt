package com.example.data.mappers

import com.example.data.models.entities.MovieEntity
import com.example.data.models.entities.TVShowEntity
import com.example.data.models.responses.MovieModelResponse
import com.example.data.models.responses.TVShowModelResponse


internal fun List<MovieModelResponse>.toMovieEntity(): List<MovieEntity> {
    return map {
        MovieEntity(
            it.backdropPath,
            it.id,
            it.originalTitle,
            it.overview,
            it.posterPath,
            it.title
        )
    }
}

internal fun List<TVShowModelResponse>.toTvShowEntity(): List<TVShowEntity> {
    return map {
        TVShowEntity(
            it.backdropPath,
            it.id,
            it.name,
            it.originalName,
            it.overview,
            it.posterPath
        )
    }
}