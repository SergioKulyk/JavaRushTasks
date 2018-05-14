package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int min = a;
        int med = b;
        int max = c;

        if (min > b) {
            med = min;
            min = b;
        }
        if (min > c) {
            med = min;
        }

        if (max < a) {
            med = max;
            max = a;
        }
        if (max < b) {
            med = max;
        }
        System.out.println(med);
    }
}
