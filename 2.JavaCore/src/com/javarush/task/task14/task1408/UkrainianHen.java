package com.javarush.task.task14.task1408;

/*
 * Created by Сергей on 25.09.2017.
 */

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth() { return 1000; }
    @Override
    public String getDescription() { return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц."; }
}
