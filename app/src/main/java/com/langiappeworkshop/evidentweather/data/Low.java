package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;

public class Low {

    @Json(name = "fahrenheit")
    private String fahrenheit;
    @Json(name = "celsius")
    private String celsius;

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

}