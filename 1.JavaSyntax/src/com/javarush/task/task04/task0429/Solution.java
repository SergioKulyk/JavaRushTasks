package com.javarush.task.task04.task0429;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();

        int a = 0;
        int b = 0;

        if (m1 > 0)
            a++;
        if (m2 > 0)
            a++;
        if (m3 > 0)
            a++;

        if (m1 < 0)
            b++;
        if (m2 < 0)
            b++;
        if (m3 < 0)
            b++;

        System.out.println("количество отрицательных чисел: " + b);
        System.out.println("количество положительных чисел: " + a);
    }
}
