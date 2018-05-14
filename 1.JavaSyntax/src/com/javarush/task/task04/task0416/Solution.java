package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float t = Float.parseFloat(reader.readLine());
        String light = "зелёный";
        t %= 5;

        if (t >= 3 && t < 4)
            light = "желтый";
        else if (t >= 4 && t < 5)
            light = "красный";
        System.out.println(light);
    }
}