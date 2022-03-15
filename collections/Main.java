package com.java.collections;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }

        for (Integer i : intList) {
            if (i % 15 == 0){
                System.out.println(i);
            }
        }

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("Hello World!");
        customLinkedList.add("My name is Earl");
        customLinkedList.add("I love Java");
        customLinkedList.add("I live in Moscow");

        System.out.println(customLinkedList.get(2));
    }
}
