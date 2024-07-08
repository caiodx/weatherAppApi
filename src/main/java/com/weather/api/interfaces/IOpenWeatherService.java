package com.weather.api.interfaces;

import com.weather.api.model.request.WeatherCityRequest;
import com.weather.api.model.request.WeatherCoordRequest;
import com.weather.api.model.response.forecast.ForeCastResponse;
import com.weather.api.model.response.weather.WeatherResponse;

public interface IOpenWeatherService {
	public WeatherResponse getWeatherCoord(WeatherCoordRequest request);
	public WeatherResponse getWeatherCity(WeatherCityRequest request);
	public ForeCastResponse getForeCastCoord(WeatherCoordRequest request);
	public ForeCastResponse getForeCastCity(WeatherCityRequest request);
}
