package com.java.inheritance;

public class British extends Cat {
    private String name;

    public British(String owner, int age, String name) {
        super(owner, age);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }


}
