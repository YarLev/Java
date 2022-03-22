package com.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Cat> catMap = new HashMap<>();

        Cat loriCat = new Cat("Lori", 6);
        Cat baxterCat = new Cat("Baxter", 3);
        Cat martinCat = new Cat("Martin", 4);
        Cat pikCat = new Cat("Pik", 10);

        String loriKey = "Lori";
        String baxterKey = "Baxter";
        String martinKey = "Martin";
        String pikKey = "Pik";

        catMap.put(loriKey, loriCat);
        catMap.put(baxterKey, baxterCat);
        catMap.put(martinKey, martinCat);
        catMap.put(pikKey, pikCat);

        System.out.println(catMap.get(loriKey));
        System.out.println(catMap.get(baxterKey));
        System.out.println(catMap.get(martinKey));
        System.out.println(catMap.get(pikKey));

        WeekDays friday = WeekDays.FRIDAY;

        if (friday == WeekDays.FRIDAY){
            System.out.println("friday");
        }

        System.out.println(friday.getDayNumberOfWeek());

        WeekDays monday = WeekDays.valueOf("MONDAY");
        System.out.println("Enum value: " + monday + " number: " + monday.getDayNumberOfWeek());
    }

}
