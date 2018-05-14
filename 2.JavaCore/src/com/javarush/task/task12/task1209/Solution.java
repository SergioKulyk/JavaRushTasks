package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int a, int b) {
        int m = a;
        if (a > b)
            m = b;
        return m;
    }

    public static long min(long a, long b) {
        long m = a;
        if (a > b)
            m = b;
        return m;
    }

    public static double min(double a, double b) {
        double m = a;
        if (a > b)
            m = b;
        return m;
    }
}
