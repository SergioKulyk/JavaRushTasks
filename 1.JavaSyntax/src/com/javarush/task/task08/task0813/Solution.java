package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> list = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            list.add("Л" + (char)('A' + 1));
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
