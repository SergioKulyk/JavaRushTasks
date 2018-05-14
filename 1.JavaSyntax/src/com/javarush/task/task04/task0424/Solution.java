package com.javarush.task.task04.task0424;
import java.util.Scanner;
/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int number = 0;
        if (a == b && a != c)
            number = 3;
        else if (a == c && a != b)
            number = 2;
        else if (b == c && b != a)
            number = 1;
        if (number != 0)
            System.out.println(number);
    }
}
