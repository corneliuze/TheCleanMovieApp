package com.example.domain.models


import com.google.gson.annotations.SerializedName

data class MovieModel(
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    val id: Int?,
    @SerializedName("original_title")
    val originalTitle: String?,
    val overview: String?,
    @SerializedName("poster_path")
    val posterPath: String?,
    val title: String?
)