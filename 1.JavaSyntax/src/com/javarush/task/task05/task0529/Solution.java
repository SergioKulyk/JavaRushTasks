package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;
        String numb = reader.readLine();
        while (!numb.equals("сумма")) {
            suma += Integer.parseInt(numb);
            numb = reader.readLine();
        }

        System.out.println(suma);
    }
}
