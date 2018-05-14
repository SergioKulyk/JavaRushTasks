package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String obj = reader.readLine();
        if (obj.equals("helicopter"))
            result = new Helicopter();
        else if (obj.equals("plane"))
            result = new Plane(parseInt(reader.readLine()));
    }
}
