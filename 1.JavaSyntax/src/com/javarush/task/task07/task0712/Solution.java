package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());

        String minFirst = list.get(0);
        String maxFirst = list.get(0);
        int indMin = 0;
        int indMax = 0;

        for (int i = 1; i < list.size(); i++) {
            if (minFirst.length() > list.get(i).length()) {
                minFirst = list.get(i);
                indMin = i;
            }
            if (maxFirst.length() < list.get(i).length()) {
                maxFirst = list.get(i);
                indMax = i;
            }
        }
        String outScreen = minFirst;
        if (indMin > indMax)
            outScreen = maxFirst;

        System.out.println(outScreen);
    }
}
