package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];
        int odd = 0, paired = 0;
        String outScreen = "В домах с четными номерами проживает больше жителей.";

        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                paired += houses[i];
            else
                odd += houses[i];
        }

        if (paired < odd)
            outScreen = "В домах с нечетными номерами проживает больше жителей.";

        System.out.println(outScreen);
    }
}
