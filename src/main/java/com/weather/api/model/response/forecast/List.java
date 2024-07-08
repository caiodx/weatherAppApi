package com.weather.api.model.response.forecast;

import java.util.ArrayList;

public class List {
	public int dt;
    public int sunrise;
    public int sunset;
    public Temp temp;
    public FeelsLike feels_like;
    public int pressure;
    public int humidity;
    public ArrayList<Weather> weather;
    public double speed;
    public int deg;
    public double gust;
    public int clouds;
    public double pop;
    public double rain;
}
