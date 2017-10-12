package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;

public class Avewind {

    @Json(name = "mph")
    private Integer mph;
    @Json(name = "kph")
    private Integer kph;
    @Json(name = "dir")
    private String dir;
    @Json(name = "degrees")
    private Integer degrees;

    public Integer getMph() {
        return mph;
    }

    public void setMph(Integer mph) {
        this.mph = mph;
    }

    public Integer getKph() {
        return kph;
    }

    public void setKph(Integer kph) {
        this.kph = kph;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Integer getDegrees() {
        return degrees;
    }

    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
    }

}
