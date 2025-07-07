package com.example.mvvmarchitecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherRepository : WeatherRepository
)
    : ViewModel() {

    private val _weatherData = MutableLiveData<Weather>()
    val weatherData : LiveData<Weather> = _weatherData

    fun refreshWeatherData() {
        val weather = weatherRepository.getWeatherData()
        _weatherData.value = weather
    }
}