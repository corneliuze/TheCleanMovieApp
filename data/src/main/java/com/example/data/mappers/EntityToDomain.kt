package com.example.data.mappers

import com.example.data.models.entities.MovieEntity
import com.example.data.models.entities.TVShowEntity
import com.example.domain.models.MovieModel
import com.example.domain.models.TVShowModel

internal fun MovieEntity.toDomain() : MovieModel {
    return MovieModel(
        this.backdropPath,
        this.id,
        this.originalTitle,
        this.overview,
        this.posterPath,
        this.title
    )
}

internal fun TVShowEntity.toDomain() : TVShowModel {
    return TVShowModel(
        this.backdropPath,
        this.id,
        this.name,
        this.originalName,
        this.overview,
        this.posterPath
    )
}