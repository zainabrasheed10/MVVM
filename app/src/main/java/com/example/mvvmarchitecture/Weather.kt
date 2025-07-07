package com.example.mvvmarchitecture

import javax.inject.Inject

data class Weather(
    val temperature: Double,
    val humidity: Int,
    val conditions: String
)

class WeatherRepository @Inject constructor(){

    fun getWeatherData() : Weather {
        //Fetch weather data
        return Weather(25.7, 70, "Sunny")
    }
}
