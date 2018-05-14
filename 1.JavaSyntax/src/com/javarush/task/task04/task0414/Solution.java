package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int day = 365;

        if (year % 4 == 0) {
            day++;
            if (year % 100 == 0 && year % 400 != 0)
                day--;
        }
        System.out.println("количество дней в году: " + day);


    }
}