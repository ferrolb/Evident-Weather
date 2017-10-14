package com.langiappeworkshop.evidentweather.data;

import com.squareup.moshi.Json;

public class Forecastday_ {

    @Json(name = "date")
    private Date date;
    @Json(name = "period")
    private Integer period;
    @Json(name = "high")
    private High high;
    @Json(name = "low")
    private Low low;
    @Json(name = "conditions")
    private String conditions;
    @Json(name = "icon")
    private String icon;
    @Json(name = "icon_url")
    private String iconUrl;
    @Json(name = "skyicon")
    private String skyicon;
    @Json(name = "pop")
    private Integer pop;
//    @Json(name = "qpf_allday")
//    private QpfAllday qpfAllday;
//    @Json(name = "qpf_day")
//    private QpfDay qpfDay;
//    @Json(name = "qpf_night")
//    private QpfNight qpfNight;
//    @Json(name = "snow_allday")
//    private SnowAllday snowAllday;
//    @Json(name = "snow_day")
//    private SnowDay snowDay;
//    @Json(name = "snow_night")
//    private SnowNight snowNight;
//    @Json(name = "maxwind")
//    private Maxwind maxwind;
    @Json(name = "avewind")
    private Avewind avewind;
    @Json(name = "avehumidity")
    private Integer avehumidity;
    @Json(name = "maxhumidity")
    private Integer maxhumidity;
    @Json(name = "minhumidity")
    private Integer minhumidity;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    public Low getLow() {
        return low;
    }

    public void setLow(Low low) {
        this.low = low;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getSkyicon() {
        return skyicon;
    }

    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

//    public QpfAllday getQpfAllday() {
//        return qpfAllday;
//    }
//
//    public void setQpfAllday(QpfAllday qpfAllday) {
//        this.qpfAllday = qpfAllday;
//    }
//
//    public QpfDay getQpfDay() {
//        return qpfDay;
//    }
//
//    public void setQpfDay(QpfDay qpfDay) {
//        this.qpfDay = qpfDay;
//    }
//
//    public QpfNight getQpfNight() {
//        return qpfNight;
//    }
//
//    public void setQpfNight(QpfNight qpfNight) {
//        this.qpfNight = qpfNight;
//    }
//
//    public SnowAllday getSnowAllday() {
//        return snowAllday;
//    }
//
//    public void setSnowAllday(SnowAllday snowAllday) {
//        this.snowAllday = snowAllday;
//    }
//
//    public SnowDay getSnowDay() {
//        return snowDay;
//    }
//
//    public void setSnowDay(SnowDay snowDay) {
//        this.snowDay = snowDay;
//    }
//
//    public SnowNight getSnowNight() {
//        return snowNight;
//    }
//
//    public void setSnowNight(SnowNight snowNight) {
//        this.snowNight = snowNight;
//    }
//
//    public Maxwind getMaxwind() {
//        return maxwind;
//    }
//
//    public void setMaxwind(Maxwind maxwind) {
//        this.maxwind = maxwind;
//    }

    public Avewind getAvewind() {
        return avewind;
    }

    public void setAvewind(Avewind avewind) {
        this.avewind = avewind;
    }

    public Integer getAvehumidity() {
        return avehumidity;
    }

    public void setAvehumidity(Integer avehumidity) {
        this.avehumidity = avehumidity;
    }

    public Integer getMaxhumidity() {
        return maxhumidity;
    }

    public void setMaxhumidity(Integer maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    public Integer getMinhumidity() {
        return minhumidity;
    }

    public void setMinhumidity(Integer minhumidity) {
        this.minhumidity = minhumidity;
    }

}