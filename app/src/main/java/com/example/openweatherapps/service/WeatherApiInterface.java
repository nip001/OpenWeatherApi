package com.example.openweatherapps.service;

import com.example.openweatherapps.model.Mantap;
import com.example.openweatherapps.model.onecall.OneCall;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiInterface {

    @GET("onecall")
    Call<OneCall> getOneCallWeather(@Query("lat") String lat, @Query("lon") String lon, @Query("exclude") String exclude, @Query("appid")String apiKey);

    @GET("weather")
    Call<Mantap> getWeatherCurrentWithCity(@Query("q") String search, @Query("appid")String apiKey);

}
//https://api.openweathermap.org/data/2.5/onecall?lat=33.44&lon=-94.04&exclude=minutely,daily&appid=caadcf08bda325f870e17d08cf7ec231
