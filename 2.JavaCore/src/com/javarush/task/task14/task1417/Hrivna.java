package com.javarush.task.task14.task1417;

/*
 * Created by Сергей on 25.09.2017.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() { return super.getAmount(); }

    public String getCurrencyName() {
        return "HRN";
    }
}
