package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;

public class Response {

    @Json(name = "version")
    private String version;
    @Json(name = "termsofService")
    private String termsofService;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermsofService() {
        return termsofService;
    }

    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

}