package com.javarush.task.task05.task0507;
import java.util.Scanner;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        float number = scan.nextInt();
        float suma = 0;
        int count = 0;

        while (number != -1) {
            suma += number;
            count++;
            number = scan.nextInt();
        }
        System.out.println(suma/(count));
    }
}

