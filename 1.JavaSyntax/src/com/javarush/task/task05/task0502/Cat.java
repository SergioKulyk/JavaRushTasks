package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (anotherCat.age < this.age && anotherCat.weight < this.weight || anotherCat.strength < this.strength)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        cat1.weight = 2;
        cat1.strength = 3;

        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.weight = 3;
        cat2.strength = 4;

        cat1.fight(cat2);
    }
}
