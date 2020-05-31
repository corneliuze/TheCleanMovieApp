package com.example.data.ext

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun <T> toFlow(list : List<T>) : Flow<List<T>> {
    return flow { emit(list) }
}

