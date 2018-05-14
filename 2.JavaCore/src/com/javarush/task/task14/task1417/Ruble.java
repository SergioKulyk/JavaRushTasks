package com.javarush.task.task14.task1417;

/*
 * Created by Сергей on 25.09.2017.
 */
public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    public String getCurrencyName() {
        return "RUB";
    }
}
