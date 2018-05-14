package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

//        ArrayList<Integer> minCountBytes = new ArrayList<>(fileInputStream.available());
//        ArrayList<Integer> listBytes = new ArrayList<>(fileInputStream.available());

//        int minCount = fileInputStream.available();
        int[] array = new int[256];
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            array[(int) i]++;
        }

        int min = array.length;
        for (int i : array)
            if (i < min && i != 0)
                min = i;

        if (min != -1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == min) {
                    System.out.print(i + " ");
                }
            }
        }

//        while (fileInputStream.available() > 0)
//            listBytes.add(fileInputStream.read());


//        while (!listBytes.isEmpty()) {
//            int currentByte = listBytes.remove(0);
//            int currentCount = 1;


//            for (int i = 0; i < listBytes.size(); i++) {
//                if (listBytes.get(i).equals(currentByte)) {
//                    listBytes.remove(i);
//                    currentCount++;
//                }
//            }

//            if (minCount <= currentCount) {
//                if (minCount == currentCount) {
//                    minCountBytes.add(currentByte);
//                }
//            } else {
//                while (!minCountBytes.isEmpty())
//                    minCountBytes.remove(0);
//                minCount = currentCount;
//                minCountBytes.add(currentByte);
//            }
//        }


//        for (int i = 0; i < minCountBytes.size(); i++) {
//            System.out.print(minCountBytes.get(i));
//            if (i < minCountBytes.size()-1)
//                System.out.print(" ");
//
//        }

        fileInputStream.close();
    }
}
