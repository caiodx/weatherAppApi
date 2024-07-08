package com.weather.api.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.weather.api.interfaces.IOpenWeatherService;
import com.weather.api.model.request.WeatherCityRequest;
import com.weather.api.model.request.WeatherCoordRequest;
import com.weather.api.model.response.forecast.ForeCastResponse;
import com.weather.api.model.response.weather.WeatherResponse;

public class OpenWeatherService implements IOpenWeatherService {		

	@Autowired
	private RestTemplate restTemplate;
	
	public WeatherResponse getWeatherCoord(WeatherCoordRequest request) {
		var apiKey = "13545dd09141f3796de545a4ec82beef";
	    String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + request.lat + "&lon=" + request.lon + "&units=metric&appid=" + apiKey;
	    var response =  restTemplate.getForEntity(url, WeatherResponse.class);
	    return response.getBody();
	}
	
	public WeatherResponse getWeatherCity(WeatherCityRequest request) {
		var apiKey = "13545dd09141f3796de545a4ec82beef";
	    String url = "https://api.openweathermap.org/data/2.5/weather?q=" + request.city + "&units=metric&appid=" + apiKey;
	    var response =  restTemplate.getForEntity(url, WeatherResponse.class);
	    return response.getBody();
	}
	
	public ForeCastResponse getForeCastCoord(WeatherCoordRequest request) {
		var apiKey = "13545dd09141f3796de545a4ec82beef";
	    String url = "https://api.openweathermap.org/data/2.5/forecast/daily?lat=" + request.lat + "&lon=" + request.lon + "&units=metric&appid=" + apiKey;
	    var response =  restTemplate.getForEntity(url, ForeCastResponse.class);
	    return response.getBody();
	}
	
	public ForeCastResponse getForeCastCity(WeatherCityRequest request) {
		var apiKey = "13545dd09141f3796de545a4ec82beef";
	    String url = "https://api.openweathermap.org/data/2.5/forecast/daily?q=" + request.city + "&units=metric&appid=" + apiKey;
	    var response =  restTemplate.getForEntity(url, ForeCastResponse.class);
	    return response.getBody();
	}
	
}
