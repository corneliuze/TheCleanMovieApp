package com.example.thecleanmovieapp.di

import android.app.Application
import com.example.thecleanmovieapp.di.viewmodel.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CleanMovieAppServiceModule::class, ViewModelModule::class])
interface AppComponent {


    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(app: Application): Builder
    }
}
