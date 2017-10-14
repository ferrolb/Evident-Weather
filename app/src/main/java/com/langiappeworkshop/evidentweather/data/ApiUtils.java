package com.langiappeworkshop.evidentweather.data;

import com.langiappeworkshop.evidentweather.RetroFitDownloader;

public class ApiUtils {

    public static RetroFitInterface getRetroFitInterface() {
        return RetroFitDownloader.getRetrofitClient().create(RetroFitInterface.class);
    }

}
