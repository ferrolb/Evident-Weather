package com.langiappeworkshop.evidentweather.data;

import java.util.List;
import com.squareup.moshi.Json;

public class Simpleforecast {

    @Json(name = "forecastday")
    private List<Forecastday_> forecastday = null;

    public List<Forecastday_> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday_> forecastday) {
        this.forecastday = forecastday;
    }

}