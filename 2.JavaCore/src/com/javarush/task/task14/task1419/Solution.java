package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }


        try {
            int[] ar = new int[0];
            ar[1] = 5;
        } catch(IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }


        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }


        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }


        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }


        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }


        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }




    }
}
