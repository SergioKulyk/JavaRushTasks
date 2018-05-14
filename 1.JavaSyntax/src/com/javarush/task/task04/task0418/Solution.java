package com.javarush.task.task04.task0418;
import java.util.Scanner;
/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = a;

        if (min > b)
            min = b;
        System.out.println(min);
    }
}