package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        String line = "";

        if (a == b && a == c)
            line = a + " " + b + " " + c;
        else if (a == b)
            line = a + " " + b;
        else if (a == c)
            line = a + " " + c;
        else if (b == c)
            line = b + " " + c;

        if (line != "")
            System.out.println(line);
    }
}