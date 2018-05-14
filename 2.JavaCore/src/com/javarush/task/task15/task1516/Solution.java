package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;


    public static void main(String[] args) {
        Solution e = new Solution();
        System.out.print(e.intVar);
        System.out.print(" " + e.doubleVar);
        System.out.print(" " + e.DoubleVar);
        System.out.print(" " + e.booleanVar);
        System.out.print(" " + e.ObjectVar);
        System.out.print(" " + e.ExceptionVar);
        System.out.print(" " + e.StringVar);
    }
}
