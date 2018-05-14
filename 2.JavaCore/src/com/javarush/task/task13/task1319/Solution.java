package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter output = new BufferedWriter(new FileWriter(fileName));

        String exit;
        while (!(exit = reader.readLine()).equals("exit")) {
           output.write(exit);
           output.write('\n');
        }
        output.write(exit);

        output.close();
        reader.close();


    }
}
