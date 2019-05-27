package com.example.androidlibararies.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {

    @SerializedName("first_name")
    private String firstName;
    @SerializedName("age")
    private int age;
    @SerializedName("mail")
    private String mail;
    @SerializedName("address")
    private Address address;
    @SerializedName("family")
    private List<FamilyMember> familyMembers;

    public Employee(String firstName, int age, String mail, Address address, List<FamilyMember> familyMembers) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.address = address;
        this.familyMembers = familyMembers;
    }
}
