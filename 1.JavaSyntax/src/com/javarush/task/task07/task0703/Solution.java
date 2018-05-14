package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] len = new int[10];
        String[] sents = new String[10];

        for (int i = 0; i < sents.length; i++)
            sents[i] = reader.readLine();

        for (int j = 0; j < len.length; j++) {
            len[j] = sents[j].length();
            System.out.println(len[j]);
        }
    }
}
