package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    public String name;
    public int weight;
    public int age;
    public String color;
    public String address;

    public static void main(String[] args) {

    }

    public Cat(String name) {
        this.name = name;
        weight = 2;
        age = 2;
        color = "black";
        address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
        address = null;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 3;
        color = "black";
        address = null;
    }

    public Cat(int weight, String color) {
        name = null;
        age = 4;
        this.weight = weight;
        this.color = color;
        address = null;
    }

    public Cat(int weight, String color, String address) {
        name = null;
        age = 4;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
