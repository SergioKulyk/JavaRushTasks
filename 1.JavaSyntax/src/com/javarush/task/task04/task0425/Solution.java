package com.javarush.task.task04.task0425;
import java.util.Scanner;
/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int q = 1;

        if (x > 0 && y < 0)
            q = 4;
        else if (x < 0 && y > 0)
            q = 2;
        else if (x < 0 && y < 0)
            q = 3;

        System.out.println(q);
    }
}
