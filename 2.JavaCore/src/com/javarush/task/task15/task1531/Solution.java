package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code
        if (n == 0)
            return "1";
        else if (n < 0)
            return "0";

        BigDecimal fact = new BigDecimal(1);
        BigDecimal len = new BigDecimal(n + 1);
        BigDecimal i;
        for (i = new BigDecimal(2); i.compareTo(len) == -1; i = i.add(new BigDecimal(1)))
            fact = fact.multiply(i);

        return fact + "";
    }
}
