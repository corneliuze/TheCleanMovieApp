package com.example.data.models.responses


import com.google.gson.annotations.SerializedName

data class MovieModelResponse(
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