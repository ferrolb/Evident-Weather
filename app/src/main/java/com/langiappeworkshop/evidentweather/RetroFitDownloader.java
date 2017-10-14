package com.langiappeworkshop.evidentweather;

import com.squareup.moshi.Moshi;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;


public class RetroFitDownloader {
    public static final String BASE_URL = "http://api.wunderground.com/";

    private static Retrofit retrofit = null;


    public static Retrofit getRetrofitClient(String baseUrl) {
        if (retrofit == null) {
            Moshi moshi = new Moshi.Builder().build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create(moshi))
                    .build();
        }
        return retrofit;
    }

//    Moshi moshi = new Moshi.Builder().build();
//
//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(MoshiConverterFactory.create(moshi))
//            .build();
}