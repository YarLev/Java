package com.java.inheritance;

public class Scottish extends Cat {
    private String name;

    public Scottish(String owner, int age, String name) {
        super(owner, age);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name: " + getName() + " Age: " + getAge() + " Owner: " + getOwner();
    }
}
