package com.javarush.task.task15.task1522;

/*
 * Created by Сергей on 28.09.2017.
 */
public class Sun implements Planet{
    private static Sun instance;

    private Sun() {}

    public static synchronized Sun getInstance() {
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}
