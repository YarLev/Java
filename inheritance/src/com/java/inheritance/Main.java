package com.java.inheritance;

public class Main {
    public static void main(String[] args) {
        British lori = new British("Alex", 6, "Lori");
        Scottish baxter = new Scottish("Peter", 10, "Baxter");

        lori.sayMeow();
        baxter.sayMeow();

        System.out.println("Cat name: " + lori.getName() + " Age: " + lori.getAge() + " Owner: " + lori.getOwner());
        System.out.println("Cat name: " + baxter.getName() + " Age: " + baxter.getAge() + " Owner: " + baxter.getOwner());

        System.out.println(lori.toString());
        System.out.println(baxter.toString());

        British martin = new British("Alex", 4, "Martin");
        British anoMartin = new British("Alex", 4, "Martin");

        System.out.println(martin.equals(anoMartin));

    }
}
