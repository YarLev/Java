package com.java.bankrepeat.entity;

public class Person {
    private String name;
    private String surName;
    private String phoneNumber;

    public Person(String name, String surName, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
