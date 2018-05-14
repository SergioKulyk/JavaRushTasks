package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        for (int i = 0; i < 40; i++) {
            int j = i;
            if (s.charAt(i) == ' ')
                j++;
            System.out.println(s.substring(j, s.length()));
        }
    }

}
