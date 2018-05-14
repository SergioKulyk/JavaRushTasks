package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int N = 10;
        for (int i = 0; i < N; i++){
            for (int j = i+1; j > 0; j--)
                System.out.print(8);
            System.out.println();
        }

    }
}
