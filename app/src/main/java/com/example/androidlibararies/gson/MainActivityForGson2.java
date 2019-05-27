package com.example.androidlibararies.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.gsm.GsmCellLocation;

import com.example.androidlibararies.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivityForGson2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_gson2);

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create(); //expose같은 annotation을 사용했을 경우에는... GsonBuilder를 이용하자.

        Employee2 employee2 = new Employee2(
                "John",
                30,
                "John@mail.com",
                "ab1234"
        );

        String jsonResult = gson.toJson(employee2);

    }
}
