package com.langiappeworkshop.evidentweather.data;

//import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroFitInterface {

//    This is used to get the raw JSON string for debugging
//    @GET("/api/d471ef2674c79e20/forecast10day/q/US/GA/Atlanta.json")
//    Call<ResponseBody> getBody();

    @GET("/api/d471ef2674c79e20/forecast10day/q/US/GA/Atlanta.json")
    Call<ForecastResponse> getForecastResponse();
}
