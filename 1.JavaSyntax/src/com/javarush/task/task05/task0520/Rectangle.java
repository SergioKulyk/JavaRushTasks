package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    public int left, top, width, height;

    public static void main(String[] args) {

    }

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }

    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }

    public Rectangle(Rectangle rect){
        left = rect.left;
        top = rect.top;
        width = rect.width;
        height = rect.height;
    }
}
