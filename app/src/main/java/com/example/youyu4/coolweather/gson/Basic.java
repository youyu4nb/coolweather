package com.example.youyu4.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    @SerializedName("parent_city")
    public String parentCity;

}
