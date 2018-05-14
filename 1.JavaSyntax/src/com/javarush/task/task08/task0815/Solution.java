package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        String[][] people = new String[][] {{"Sergey", "Kulyk"},
                {"Masha", "Klumchuk"},
                {"Andry", "Chan"},
                {"Makdfs", "Kilipov"},
                {"Rita", "Marka"},
                {"Mark", "Alika"},
                {"Anya", "Gub"},
                {"Mark", "Tko"},
                {"Madfrk", "Alika"},
                {"Mtks", "Meyson"}};

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < people.length; i++)
            map.put(people[i][0], people[i][0]);

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countFirst = 0;
        for (Map.Entry<String, String> iterator : map.entrySet())
            if (iterator.getValue().equals(name))
                countFirst++;

        return countFirst;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int countSecond = 0;
        for (Map.Entry<String, String> iterator : map.entrySet())
            if (iterator.getKey().equals(lastName))
                countSecond++;
        return countSecond;
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map = createMap();
//        System.out.println(getCountTheSameFirstName(map, "Maks") + " " + getCountTheSameLastName(map, "Alika"));
    }
}
