package com.weather.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.weather.api.interfaces.IOpenWeatherService;
import com.weather.api.services.OpenWeatherService;

@Configuration
public class AppConfig {
    @Bean
    IOpenWeatherService openWeatherService() {
        return new OpenWeatherService();
    }
    
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}