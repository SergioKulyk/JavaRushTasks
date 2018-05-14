package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge obj) {
        if (obj instanceof WaterBridge || obj instanceof SuspensionBridge)
            System.out.println(obj.getCarsCount());
    }

}

