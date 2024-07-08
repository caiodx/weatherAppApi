package com.weather.api.model.response.forecast;

import java.util.ArrayList;

import com.weather.api.model.response.ResponseBase;

public class ForeCastResponse extends ResponseBase {
	public City city;
    public String cod;
   // public double message;
    public int cnt;
    public ArrayList<List> list;
}
