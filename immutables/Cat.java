package com.java.immutables;

public final class Cat {
    private final String name;
    private final Integer age;
    private final Owner owner;

    public Cat(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }
}
