package com.java.polymorphizm;

public class Cat extends AbstractAnimal {
    private String name;
    private int age;
    private String owner;

    @Override
    public void say() {
        System.out.println("Meow!");
    }
}
