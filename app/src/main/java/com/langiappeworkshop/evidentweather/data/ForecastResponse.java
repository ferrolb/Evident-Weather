package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;


public class ForecastResponse {

    @Json(name = "response")
    private Response response;
    @Json(name = "forecast")
    private Forecast forecast;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

}