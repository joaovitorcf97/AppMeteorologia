package com.example.appmeteorologia.data.di

import com.example.appmeteorologia.data.repository.WeatheRepository
import com.example.appmeteorologia.data.repository.WeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModel {

    @Binds
    fun bindWeatherRepository(repository: WeatherRepositoryImpl): WeatheRepository
}