package com.ohgiraffers.section04.constructor;

public class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public User(String name, int age, String phone){
        this.age = age;
        this.name = name;
        this.phone= phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
