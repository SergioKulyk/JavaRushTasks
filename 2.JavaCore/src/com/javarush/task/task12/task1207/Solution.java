package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(12);
        print((Integer) 2);
    }

    static void print(int a) {  System.out.println(a); }
    static void print(Integer a) {  System.out.println(a); }
}
