package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> devByThree = new ArrayList<>();
        ArrayList<Integer> devByTwo = new ArrayList<>();
        ArrayList<Integer> devByOther = new ArrayList<>();

        for (int i = 0; i < 20; i++)
            mainList.add(Integer.parseInt(reader.readLine()));

        for (Integer tmp : mainList) {
            if (tmp % 3 == 0)
                devByThree.add(tmp);
            if (tmp % 2 == 0)
                devByTwo.add(tmp);
            if (tmp % 3 != 0 && tmp % 2 != 0)
                devByOther.add(tmp);
        }

        printList(devByThree);
        printList(devByTwo);
        printList(devByOther);
    }

    public static void printList(List<Integer> list) {
        for (int n : list)
            System.out.println(n);
    }
}
