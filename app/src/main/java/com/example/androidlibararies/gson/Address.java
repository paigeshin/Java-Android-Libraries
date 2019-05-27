package com.example.androidlibararies.gson;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("country")
    private String country;
    @SerializedName("city")
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

}
