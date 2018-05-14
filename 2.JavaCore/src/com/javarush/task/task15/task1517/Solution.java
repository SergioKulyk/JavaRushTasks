package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн
        if (true)throw new RuntimeException();
    }

    private static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
