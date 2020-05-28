package com.example.data.mappers

import com.example.data.models.entities.MovieEntity
import com.example.data.models.entities.TVShowEntity
import com.example.data.models.responses.MovieModelResponse
import com.example.data.models.responses.TVShowModelResponse

internal fun MovieModelResponse.toEntity(): MovieEntity {
    return MovieEntity(
        this.backdropPath,
        this.id,
        this.originalTitle,
        this.overview,
        this.posterPath,
        this.title
    )
}

internal fun TVShowModelResponse.toEntity(): TVShowEntity {
    return TVShowEntity(
        this.backdropPath,
        this.id,
        this.name,
        this.originalName,
        this.overview,
        this.posterPath
    )
}