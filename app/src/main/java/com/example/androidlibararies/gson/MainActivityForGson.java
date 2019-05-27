package com.example.androidlibararies.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.androidlibararies.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivityForGson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_gson);

        //Gson Code Begins Here


        Gson gson = new Gson();

        /*
        Address address = new Address("Korea", "Seoul"); //이러한 객체안의 객체 형태도 gson을 통하여 json으로 바꿀 수 있다.
        List<FamilyMember> family = new ArrayList<>(); //이러한 list같은 자료구조도 gson을 통하여 json으로 바꿀 수 있다. 리스트 대신 어레이를 넣어도 결과는 똑같다.
        family.add(new FamilyMember("wife", 30));
        family.add(new FamilyMember("Daughter", 5));

        Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
        String json = gson.toJson(employee); //현재 Employee라는 객체를 json형태의 String으로 바꾸는 강력한 기능을 보여주고 있다.

        //리스트를 json형태로 만드는 것 예제
        String json = gson.toJson(family);
        */


        String json = "[{\"age\":30,\"role\":\"wife\"},{\"age\":5,\"role\":\"Daughter\"}]";
        //이 코드와 String json = gson.toJson(employee);는 같은 의미다.

        Employee employee = gson.fromJson(json, Employee.class);
        //제이슨 형태의 파일을 다시 객체로 변환하는 코드.

        //리스트 형태의 json을 어레이로 불러오는 방법
        FamilyMember[] family = gson.fromJson(json, FamilyMember[].class); //어레이로 반환
        //리스트 형태의 json을 리스트로 불러오는 방법
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> familyMember = gson.fromJson(json, familyType);

    }
}
