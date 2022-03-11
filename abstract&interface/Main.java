package com.java.polymorphizm;

public class Main {
    public static void main(String[] args) {
        Cat lori = new Cat();
        Dog rex = new Dog();

        lori.say();
        rex.say();

        findOwner(lori);
        findOwner(rex);

        System.out.println("Lori: " + lori.getOwner() + ", Rex: " + rex.getOwner());
    }

    private static void findOwner(Animal animal) {
        if (animal.getClass() == Cat.class) {
            animal.setOwner("Cat_owner");
        } else {
            animal.setOwner("Dog_owner");
        }
    }
}
