package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        int[] times = new int[alphabet.size()];
        for (int i = 0; i < 10; i++) {
            char[] tmp = list.get(i).toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                for (int k = 0; k < abcArray.length; k++) {
                    if (tmp[j] == abcArray[k])
                        times[k]++;
                }
            }
        }

        for (int i = 0; i < 33; i++)
            System.out.println(alphabet.get(i) + " " + times[i]);
    }
}
