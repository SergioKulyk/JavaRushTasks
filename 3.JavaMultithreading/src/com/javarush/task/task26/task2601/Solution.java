package com.javarush.task.task26.task2601;

import java.util.*;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
//        sort(new Integer[]{13, 8, 15, 5, 17});
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        int median = median(array);
//        System.out.println(median);
        int lenArray = array.length;

        for (int i = 0; i <  lenArray - 1; i++) {
            for (int j = i+1; j < lenArray; j++) {
                int first = median - array[i];
                int second = median - array[j];

                if (Math.abs(first) > Math.abs(second)) {
                    if (first < second)
                        continue;
                    swap(array, i, j);
                }
            }
        }
//        System.out.println(Arrays.asList(array));

        return array;
    }

    private static int median(Integer[] array) {
        List<Integer> intList = Arrays.asList(array);
        Collections.sort(intList);
//        System.out.println(Arrays.asList(array));
        int lenList = intList.size() / 2;
        return intList.size() % 2 == 0 ? (intList.get(lenList - 1) + intList.get(lenList)) / 2 : intList.get(lenList);
    }

    private static void swap(Integer[] array, int ind1, int ind2) {
        int var = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = var;
    }
}
