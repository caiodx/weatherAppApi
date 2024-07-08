package com.weather.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.api.interfaces.IOpenWeatherService;
import com.weather.api.model.request.WeatherCityRequest;
import com.weather.api.model.request.WeatherCoordRequest;
import com.weather.api.model.response.forecast.ForeCastResponse;
import com.weather.api.model.response.weather.WeatherResponse;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/weatherapi")
public class WeatherController {
	
	@Autowired
	private IOpenWeatherService _openWeatherService;
	
	@GetMapping("/coord")
	public ResponseEntity<WeatherResponse> getWeatherCoor(@RequestParam String lat,  @RequestParam String lon) {
	    try{
	    	var request = new WeatherCoordRequest();
	    	request.lat =  Double.parseDouble(lat);
	    	request.lon =  Double.parseDouble(lon);
	    	WeatherResponse response = _openWeatherService.getWeatherCoord(request);
		    response.success = true;
		    return ResponseEntity.ok(response);
		}catch (Exception e) {
			WeatherResponse response = new WeatherResponse();
			response.success = false;
			response.message = e.getMessage();
			return ResponseEntity.ok(response);
		}	    	
    }
	
	@GetMapping("/city")
	public ResponseEntity<WeatherResponse> getWeatherCity(@RequestParam String city) {
		try{
			var request = new WeatherCityRequest();
			request.city = city;
	    	WeatherResponse response = _openWeatherService.getWeatherCity(request);
		    response.success = true;
		    return ResponseEntity.ok(response) ;
		}catch (Exception e) {
			WeatherResponse response = new WeatherResponse();
			response.success = false;
			response.message = e.getMessage();
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/forecast-coord")
	public ResponseEntity<ForeCastResponse> getForeCastCoord(@RequestParam String lat,  @RequestParam String lon) {
	    try{
	    	var request = new WeatherCoordRequest();
	    	request.lat =  Double.parseDouble(lat);
	    	request.lon =  Double.parseDouble(lon);
	    	ForeCastResponse response = _openWeatherService.getForeCastCoord(request);
		    response.success = true;
		    return ResponseEntity.ok(response);
		}catch (Exception e) {
			ForeCastResponse response = new ForeCastResponse();
			response.success = false;
			response.message = e.getMessage();
			return ResponseEntity.ok(response);
		}	    	
    }
	
	@GetMapping("/forecast-city")
	public ResponseEntity<ForeCastResponse> getForeCastCity(@RequestParam String city) {
		try{
			var request = new WeatherCityRequest();
			request.city = city;
			ForeCastResponse response = _openWeatherService.getForeCastCity(request);
		    response.success = true;
		    return ResponseEntity.ok(response) ;
		}catch (Exception e) {
			ForeCastResponse response = new ForeCastResponse();
			response.success = false;
			response.message = e.getMessage();
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}
}
