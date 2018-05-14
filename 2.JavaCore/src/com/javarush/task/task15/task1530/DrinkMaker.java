package com.javarush.task.task15.task1530;

/*
 * Created by Сергей on 28.09.2017.
 */

public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
