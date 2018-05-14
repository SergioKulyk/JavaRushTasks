package com.javarush.task.task04.task0442;


/* 
Суммирование
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numb = scan.nextInt();
        int suma = 0;

        while (numb != -1) {
            suma += numb;
            numb = scan.nextInt();
        }
        suma -= 1;
        System.out.println(suma);
    }
}
