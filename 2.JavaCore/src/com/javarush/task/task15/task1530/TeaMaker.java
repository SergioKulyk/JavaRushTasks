package com.javarush.task.task15.task1530;

/**
 * Created by Сергей on 28.09.2017.
 */
public class TeaMaker extends DrinkMaker {
    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    public void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    public void pour() {
        System.out.println("Заливаем кипятком");
    }
}
