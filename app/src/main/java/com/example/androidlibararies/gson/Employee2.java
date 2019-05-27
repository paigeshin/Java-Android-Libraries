package com.example.androidlibararies.gson;

import com.google.gson.annotations.Expose;

public class Employee2 {

    //Deserialize Example.
    @Expose
    private String firstName;
    @Expose(serialize = false, deserialize = false) //serialize를 false로 하면 정보가 나오지 않는 것을 확인 할 수 있다.
    private int age;
    @Expose(deserialize = false)
    private String mail;
    @Expose
    private String password;

    public Employee2(String firstName, int age, String mail, String password) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }
    //첫 번째 실험 - 두 번째 field가 serialize = false로 되어 있을 때 세 번째 필드도 false가 되나?
    //첫 번째 실험 결과 - 세 번째 field도 그냥 serialize = true (디폹트값)과 동일한 결과를 냈다. 즉 mail은 출력된다.
    //두 번째 실험 - serialize = false, 그리고 deserialize = false로 두면 무슨 일이 생기나?
    //두 번째 실험 결과 - 그냥 결가는 serialize = false 하나만 있을 때와 똑같다.
}
