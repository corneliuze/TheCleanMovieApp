package com.example.data.models.responses


import com.google.gson.annotations.SerializedName

data class TVShowModelResponse(
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