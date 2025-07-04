package com.example.mvvmarchitecture

data class Weather(
    val temperature: Double,
    val humidity: Int,
    val conditions: String
)

class WeatherRepository {

    fun getWeatherData() : Weather {
        //Fetch weather data
        return Weather(25.7, 70, "Sunny")
    }
}
