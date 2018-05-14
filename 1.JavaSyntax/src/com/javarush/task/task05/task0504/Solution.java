package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat andriy = new Cat("Andriy", 2, 4, 6);
        Cat vahya = new Cat("Vasya", 3, 3, 3);
        Cat sergo = new Cat("sergo", 10, 10, 10);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}