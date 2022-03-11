package com.java.inheritance;

public class Cat {
    private String owner;
    private int age;

    public Cat(String owner, int age) {
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return owner;
    }

    public void setName(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }
}
