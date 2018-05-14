package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] flats = new int[20];


        for (int i = 0; i < flats.length; i++)
            flats[i] = Integer.parseInt(reader.readLine());

        maximum = flats[0];
        minimum = flats[0];
        for (int i = 1; i < flats.length; i++) {
            if (maximum < flats[i])
                maximum = flats[i];
            if (minimum > flats[i])
                minimum = flats[i];
        }
        System.out.println(maximum + " " + minimum);
    }
}
