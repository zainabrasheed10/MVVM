package com.example.mvvmarchitecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel() {
    private val weatherRepository = WeatherRepository()

    private val _weatherData = MutableLiveData<Weather>()
    val weatherData : LiveData<Weather> = _weatherData

    fun refreshWeatherData() {
        val weather = weatherRepository.getWeatherData()
        _weatherData.value = weather
    }
}