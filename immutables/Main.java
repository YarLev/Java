package com.java.immutables;

public class Main {
    public static void main(String[] args) {
        String a = "ABC";
        a.concat("DEF");
        String b = a.concat("DEF");
        System.out.println(a);
        System.out.println(b);

        String c = "123";
        String d = "456";
        System.out.println(c + d);

        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("DEF").append("JKL");
        System.out.println(stringBuilder);

        String asd = "asd";
        asd = "dsa";
        System.out.println(asd);

        //////////////////////////

        Owner alex = new Owner("Alex");
        final Cat lori = new Cat("Lori", 4, alex);

    }
}
