package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] fruitVegt = {"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < fruitVegt.length; i++)
            set.add(fruitVegt[i]);

        for (String i : set)
            System.out.println(i);
    }
}
