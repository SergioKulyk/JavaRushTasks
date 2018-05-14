package com.javarush.task.task14.task1413;

/*
 * Created by Сергей on 25.09.2017.
 */
public class Computer {
    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
