package com.example.demo;

public class Person {
    private String id;
    private String age;
    private String address;

    public Person() {
    }

    public Person(String id, String age, String address) {
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
