package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public String name;
    public int weight;
    public int age;
    public String address;
    public String color;

    public static void main(String[] args) {

    }

    public void initialize(String name) {
        this.name = name;
        weight = 3;
        age = 4;
        color = "black";
        address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
        address = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 2;
        color = "brown";
        address = null;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        name = null;
        age = 2;
        address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        name = null;
        age = 5;
    }
}
