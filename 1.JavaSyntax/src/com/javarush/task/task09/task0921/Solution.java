package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        boolean isRun = true;

        while (isRun) {
            try {
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
            } catch (NumberFormatException e) {
                for (Integer number : list)
                    System.out.println(number);
                isRun = false;
            }
            catch (IOException e) {

            }
        }
    }
}
