package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;

public class Forecast {

    @Json(name = "simpleforecast")
    private Simpleforecast simpleforecast;

    public Simpleforecast getSimpleforecast() {
        return simpleforecast;
    }

    public void setSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
    }

}