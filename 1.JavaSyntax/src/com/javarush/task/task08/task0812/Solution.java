package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        int tmp = 1; // for the longest step
        int maxStep = 1;
        for (int i = 0; i < 10; i++)
            numbers.add(Integer.parseInt(reader.readLine()));

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == numbers.get(i - 1)) {
                tmp += 1;
                if (maxStep < tmp)
                    maxStep = tmp;
            } else
                tmp = 1;
        }
        System.out.println(maxStep);
    }
}