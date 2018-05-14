package com.javarush.task.task04.task0426;
import java.util.Scanner;
/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        boolean m = number % 2 == 0;
        String line ="положительное нечетное число";

        if (number < 0 && m)
            line = "отрицательное четное число";
        else if (number < 0 && !m)
            line = "отрицательное нечетное число";
        else if (number > 0 && m)
            line = "положительное четное число";
        else if (number == 0)
            line = "ноль";

        System.out.println(line);
    }
}
