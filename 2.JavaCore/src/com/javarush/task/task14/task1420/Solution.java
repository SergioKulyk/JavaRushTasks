package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x, y;
        x = Integer.parseInt(reader.readLine());
        if (x <= 0)
            throw new NumberFormatException();

        y = Integer.parseInt(reader.readLine());
        if (y <= 0)
            throw new NumberFormatException();

        while (x != 0 && y != 0) {
            if (x > y)
                    x %= y;
            else
                y %= x;
        }
        if (x != 0)
            System.out.println(x);
        else
            System.out.println(y);

    }
}
