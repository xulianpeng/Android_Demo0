package com.example.lianpeng.android_demoone;

/**
 * Created by lianpeng on 2017/4/5.
 */

public class Student {

    private String name;
    private String sex;
    private int age;
    private String introduction;

    public Student(String name,String sex,int age,String introduction){

        this.name = name;
        this.sex = sex;
        this.age = age;
        this.introduction = introduction;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getIntroduction() {
        return introduction;
    }
}
