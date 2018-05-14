package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Double.*;


/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        int sing = url.indexOf('?');

        url = url.substring(sing + 1, url.length());

        String[] listParameters = url.split("&");
        String tmp;
        String obj = "";
        String objValue = "";

        for (String str : listParameters) {
            if (str.contains("=")) {
                sing = str.indexOf("=");
                tmp = str.substring(0, sing);
            }
            else
                tmp = str;

            if (tmp.equals("obj")) {
                obj = "obj";
                objValue = str.substring(sing + 1, str.length());
            }

            System.out.print(tmp + " ");
        }

        if (obj.equals("obj")) {
            System.out.println();
            try {
                alert(parseDouble(objValue));
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
