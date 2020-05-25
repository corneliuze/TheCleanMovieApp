package com.example.domain.models


import com.google.gson.annotations.SerializedName

data class TVShowModel(
    @SerializedName("backdrop_path")
    val backdropPath: String,
    val id: Int,
    val name: String,
    @SerializedName("original_name")
    val originalName: String,
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String
)