package com.javarush.task.task04.task0420;
import java.util.Scanner;
/*
Сортировка трех чисел
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;
        int med = b;
        int min = c;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        if (a < min)
            min = a;
        if (b < min)
            min = b;

        if (a > min && a < max)
            med = a;
        if (c > min && c < max)
            med = c;


        System.out.println(max + " " + med + " " + min);
    }
}
