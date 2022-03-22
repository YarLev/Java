package com.java.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

        int[] mass = new int[]{2, 4, 1, 9, 5, 30, 15};

        fillCollection(arrayList, mass);
        fillCollection(linkedList, mass);
        fillCollection(hashSet, mass);
        fillCollection(treeSet,mass);

        System.out.println("arrayList");
        printCollection(arrayList);
        System.out.println("\nlinkedList");
        printCollection(linkedList);
        System.out.println("\nhashSet");
        printCollection(hashSet);
        System.out.println("\ntreeSet");
        printCollection(treeSet);

    }
    
    
    private static void printCollection(Collection<Integer> collection){
        for (Integer elem : collection) {
            System.out.print(elem + ", ");
        }
    }

    private static void fillCollection(Collection<Integer> collection, int[] mass){
        for (int elem : mass) {
            collection.add(elem);
        }
    }
}
