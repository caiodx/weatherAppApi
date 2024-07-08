package com.weather.api.model.response.weather;

import java.util.ArrayList;
import com.weather.api.model.response.ResponseBase;

public class WeatherResponse extends ResponseBase {
    public Coord coord;
    public ArrayList<Weather> weather;
    public String base;
    public Main main;
    public int visibility;
    public Wind wind;
    public Rain rain;
    public Clouds clouds;
    public int dt;
    public Sys sys;
    public int timezone;
    public int id;
    public String name;
    public int cod;
}
