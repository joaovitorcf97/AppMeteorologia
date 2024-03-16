package com.example.appmeteorologia.data

import com.example.appmeteorologia.data.remote.RemoteDataSource
import com.example.appmeteorologia.data.remote.response.WeatherDataResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class KtorRemoteDataSource @Inject constructor(
    private val httpClient: HttpClient
) : RemoteDataSource {
    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/data/2.5"
    }

    override suspend fun getWeatherDataResponde(lat: Float, lon: Float): WeatherDataResponse {
        return httpClient
            .get("$BASE_URL/weather?lat=${lat}&lon=${lon}&appid=48c76f105589d21a1457394f9ecf21ad&units=metric")
            .body()
    }
}