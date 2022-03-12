package com.java.wrapper.com.java.wrapper;

public class Main {
    public static void main(String[] args) {
        Integer firstNumber = new Integer(10);
        Integer secondNumber = new Integer(10);

        int a = 10;
        int b = 10;

        System.out.println(firstNumber == secondNumber);
        System.out.println(a == b);

        System.out.println(firstNumber.equals(secondNumber));
    }
}
