package com.javarush.task.task04.task0432;
import java.util.Scanner;


/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int N = scan.nextInt();
        int i = 0;
        while (i++ < N)
            System.out.println(s);
    }
}
