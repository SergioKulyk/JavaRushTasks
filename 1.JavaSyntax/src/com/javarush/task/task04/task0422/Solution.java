package com.javarush.task.task04.task0422;
import java.util.Scanner;
/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int age = scan.nextInt();

        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
