package com.langiappeworkshop.evidentweather.data;

import com.langiappeworkshop.evidentweather.RetroFitDownloader;

/**
 * Created by ferrolblackmon on 10/11/17.
 */

public class ApiUtils {

    public static final String BASE_URL = "http://api.wunderground.com/";

    public static RetroFitInterface getRetroFitInterface() {
        return RetroFitDownloader.getRetrofitClient(BASE_URL).create(RetroFitInterface.class);
    }
}
