package com.example.thecleanmovieapp.di.viewmodel

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: MovieAppViewModelFactory): ViewModelProvider.Factory


}
