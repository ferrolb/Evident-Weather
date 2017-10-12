package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;

public class Forecast {

//    @Json(name = "txt_forecast")
//    private TxtForecast txtForecast;
    @Json(name = "simpleforecast")
    private Simpleforecast simpleforecast;

//    public TxtForecast getTxtForecast() {
//        return txtForecast;
//    }
//
//    public void setTxtForecast(TxtForecast txtForecast) {
//        this.txtForecast = txtForecast;
//    }

    public Simpleforecast getSimpleforecast() {
        return simpleforecast;
    }

    public void setSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
    }

}