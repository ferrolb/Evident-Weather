package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;

public class Date {

    @Json(name = "epoch")
    private String epoch;
    @Json(name = "pretty")
    private String pretty;
    @Json(name = "day")
    private Integer day;
    @Json(name = "month")
    private Integer month;
    @Json(name = "year")
    private Integer year;
    @Json(name = "yday")
    private Integer yday;
    @Json(name = "hour")
    private Integer hour;
    @Json(name = "min")
    private String min;
    @Json(name = "sec")
    private Integer sec;
    @Json(name = "isdst")
    private String isdst;
    @Json(name = "monthname")
    private String monthname;
    @Json(name = "monthname_short")
    private String monthnameShort;
    @Json(name = "weekday_short")
    private String weekdayShort;
    @Json(name = "weekday")
    private String weekday;
    @Json(name = "ampm")
    private String ampm;
    @Json(name = "tz_short")
    private String tzShort;
    @Json(name = "tz_long")
    private String tzLong;

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYday() {
        return yday;
    }

    public void setYday(Integer yday) {
        this.yday = yday;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public Integer getSec() {
        return sec;
    }

    public void setSec(Integer sec) {
        this.sec = sec;
    }

    public String getIsdst() {
        return isdst;
    }

    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    public String getMonthname() {
        return monthname;
    }

    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    public String getMonthnameShort() {
        return monthnameShort;
    }

    public void setMonthnameShort(String monthnameShort) {
        this.monthnameShort = monthnameShort;
    }

    public String getWeekdayShort() {
        return weekdayShort;
    }

    public void setWeekdayShort(String weekdayShort) {
        this.weekdayShort = weekdayShort;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getTzShort() {
        return tzShort;
    }

    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    public String getTzLong() {
        return tzLong;
    }

    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
    }

}