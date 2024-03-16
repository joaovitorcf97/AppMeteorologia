package com.example.appmeteorologia.data.repository

import com.example.appmeteorologia.data.model.WeatherInfo
import com.example.appmeteorologia.data.remote.response.Weather

interface WeatheRepository {
    suspend fun getWeatherData(lat: Float, lon: Float): WeatherInfo
}