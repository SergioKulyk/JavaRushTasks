package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        ArrayList<Integer> sortedList = new ArrayList<>(fileInputStream.available());

        while (fileInputStream.available() > 0) {
            Integer i = fileInputStream.read();
            if (!sortedList.contains(i))
                sortedList.add(i);
        }

        int[] array = new int[sortedList.size()];

        for (int i = 0; i < array.length; i++)
            array[i] = sortedList.get(i);

        for (int i = 1; i < array.length; i++) {
            int j = i -1;
            int key = array[i];
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

       for (int i : array)
           System.out.print(i + " ");

        fileInputStream.close();
    }
}
