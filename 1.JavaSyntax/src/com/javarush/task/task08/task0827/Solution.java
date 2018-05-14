package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date daysNow = new Date(date);
        Date days = new Date(daysNow.getYear(), 1, 1);
        long timeStart = days.getTime() / 1000 / 60 / 60 / 24 - 1;
        long timeEnd = daysNow.getTime() / 1000 / 60 / 60 / 24 + 1;
        long r = timeEnd - timeStart;

        if (r % 2 == 0)
            return false;
        else
            return true;
    }
}
