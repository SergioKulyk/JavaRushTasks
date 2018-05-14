package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        for (int i = 0; i < list.length; i++) {
            ArrayList<String> tmpList = new ArrayList<String>();
            for (int j = 0; j < 3; j++) {
                tmpList.add("" + j * i);
            }
            list[i] = tmpList;
        }
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}