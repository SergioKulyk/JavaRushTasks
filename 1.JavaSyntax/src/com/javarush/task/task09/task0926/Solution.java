package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] sizes = new int[] {5, 2, 4, 7, 0};
        ArrayList<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i < sizes.length; i++) {
            int[] array = new int[sizes[i]];

            for (int j = 0; j < array.length; j++)
                array[j] = 0 + (int) (Math.random() * 10);

            list.add(array);
        }

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
