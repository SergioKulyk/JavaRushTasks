package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        ArrayList<Integer> maxCountBytes = new ArrayList<Integer>(fileInputStream.available());
        ArrayList<Integer> listBytes = new ArrayList<Integer>(fileInputStream.available());

        int maxCount = 1;

        while (fileInputStream.available() > 0) {
            listBytes.add(fileInputStream.read());
        }

        while (!listBytes.isEmpty()) {
            int currentByte = listBytes.remove(0);
            int currentCount = 1;

            for (int i = 0; i < listBytes.size(); i++) {
                if (listBytes.get(i).equals(currentByte)) {
                    listBytes.remove(i);
                    currentCount++;
                }
            }

            if (currentCount <= maxCount) {
                if (currentCount == maxCount) maxCountBytes.add(currentByte);
            } else {
                while (!maxCountBytes.isEmpty())
                    maxCountBytes.remove(0);
                maxCountBytes.add(currentByte);
                maxCount = currentCount;
            }
        }


        for (Integer i : maxCountBytes)
            System.out.print(i + " ");

        fileInputStream.close();
    }
}
