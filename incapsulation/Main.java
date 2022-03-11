package com.java.incapsulation;

public class Main {
    public static void main(String[] args) {
        Cat lori = new Cat("Lori", 7, "Peter");
        SayCatService sayCatService = new SayCatService();
        sayCatService.say(lori, "I want to eat");

        Cat baxter = new Cat("Baxter", 10, "John");
        sayCatService.say(baxter, "I want to play");

        Cat kisa = new Cat("Kisa", 5, "Yarik");
        sayCatService.say(kisa, "I want to sleep");

        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);
    }
}
