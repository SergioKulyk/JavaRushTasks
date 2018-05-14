package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(name1);
        FileOutputStream file2 = new FileOutputStream(name2);
        FileOutputStream file3 = new FileOutputStream(name3);

        int file2Length = file1.available() % 2 == 0 ? file1.available() / 2 : file1.available() / 2 + 1;

        byte[] buffer = new byte[file2Length];

        while (file1.available() > file2Length) {
            int count = file1.read(buffer);
            file2.write(buffer, 0, count);
        }

        while (file1.available() > 0) {
            int count = file1.read(buffer);
            file3.write(buffer, 0, count);
        }

        file1.close();
        file2.close();
        file3.close();
    }
}
