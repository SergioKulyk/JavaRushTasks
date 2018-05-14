package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        int max = 0;
        int current;
        while ((fileInputStream.available()) > 0) {
            current = fileInputStream.read();
            if (current > max)
                max = current;
        }
        fileInputStream.close();

        System.out.println(max);
    }
}
