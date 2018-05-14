package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int suma = 0;
        while (number > 0) {
            suma += number % 10;
            number /= 10;
        }
        return suma;
    }
}