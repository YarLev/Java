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
    }


}
