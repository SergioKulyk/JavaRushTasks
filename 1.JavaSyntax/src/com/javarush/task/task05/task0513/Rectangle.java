package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left, top, width, height;

    public static void main(String[] args) {

    }

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top =  top;
        this.width = width;
        height = width;
    }

    public void initialize(Rectangle quadr) {
        left = quadr.left;
        top = quadr.top;
        width = quadr.width;
        height = quadr.height;
    }
}
