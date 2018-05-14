package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение

        String out = "";
        String s = o.getClass().getName();
        System.out.println(s);

        if (s.equals("Cat"))
            out = "Кошка";
        else if (o.equals("Lamp"))
            out = "Лампа";
        else if (o.equals("Bird"))
            out = "Птица";
        else if (o.equals("Dog"))
            out = "Собака";

        if (!out.equals(""))
            System.out.println(out);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
