package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inp = new FileInputStream(reader.readLine());

        while (inp.available() > 0) System.out.write(inp.read());
        System.out.println();

        inp.close();
        reader.close();
    }
}