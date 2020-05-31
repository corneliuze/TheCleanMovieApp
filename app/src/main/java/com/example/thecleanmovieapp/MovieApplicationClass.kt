package com.example.thecleanmovieapp

import android.app.Application
import com.example.thecleanmovieapp.di.AppComponent
import com.example.thecleanmovieapp.di.DaggerAppComponent

class MovieApplicationClass : Application() {
    lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        // TODO set up dagger later
    }
}