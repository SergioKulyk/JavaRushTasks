package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0, j = 0;
        int n = 10;

        while (i < n) {
            while (j < n){
                System.out.print("S");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }


    }
}
