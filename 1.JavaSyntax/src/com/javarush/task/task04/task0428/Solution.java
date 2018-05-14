package com.javarush.task.task04.task0428;
import java.util.Scanner;
/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int odd = 0;

        if (a > 0)
            odd++;
        if (b > 0)
            odd++;
        if (c > 0)
            odd++;

        System.out.println(odd);
    }
}
