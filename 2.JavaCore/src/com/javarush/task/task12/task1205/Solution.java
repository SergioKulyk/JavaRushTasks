package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String animal = o.getClass().getSimpleName();
        String out = "Неизвестное животное";

        if (animal.equals("Cow"))
            out = "Корова";
        else if (animal.equals("Dog"))
            out = "Собака";
        else if (animal.equals("Whale"))
            out = "Кит";

        return out;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
