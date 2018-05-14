package com.javarush.task.task04.task0427;
import java.util.Scanner;
/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n > 0 && n < 1000) {
            boolean p = n % 2 == 0;
            int s = n / 10;
            String out = "четное однозначное число";

            if (s == 0 && !p)
                out = "нечетное однозначное число";
            else if (s >= 1 && s < 10 && p)
                out = "четное двузначное число";
            else if (s >= 1 && s < 10 && !p)
                out = "нечетное двузначное число";
            else if (s >= 10 && s < 100 && p)
                out = "четное трехзначное число";
            else if (s >= 10 && s < 100 && !p)
                out = "нечетное трехзначное число";
            System.out.println(out);
        }
    }
}
