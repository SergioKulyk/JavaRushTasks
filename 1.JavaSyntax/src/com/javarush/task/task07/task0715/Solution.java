package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 1; i <= list.size(); i+=2)
            list.add(i, "именно");

        for (String s : list)
            System.out.println(s);
    }
}
