package com.java.alhorithms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First text");
        list.add("Second text");
        list.add("Third text");

        System.out.println(linearSearch(list, "Second"));
    }

    private static int linearSearch(List<String> list, String args){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(args)) {
                return i;
            }
        }
        return -1;
    }

}
