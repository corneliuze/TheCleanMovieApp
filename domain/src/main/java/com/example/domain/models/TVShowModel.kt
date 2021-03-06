package com.example.domain.models

data class TVShowModel(
    val backdropPath: String,
    val id: Int,
    val name: String,
    val originalName: String,
    val overview: String,
    val posterPath: String
)