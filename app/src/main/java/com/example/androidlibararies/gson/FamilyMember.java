package com.example.androidlibararies.gson;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {

    @SerializedName("role")
    private String role;
    @SerializedName("age")
    private int age;

    public FamilyMember(String role, int age) {
        this.role = role;
        this.age = age;
    }
}
