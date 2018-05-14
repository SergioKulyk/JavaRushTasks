package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFileInput = reader.readLine();
        String nameFileOutput = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(nameFileInput);

        FileOutputStream fileOutputStream = new FileOutputStream(nameFileOutput);

        byte[] buffer = new byte[fileInputStream.available()];
        int count = 0;

        while (fileInputStream.available() > 0)
            count = fileInputStream.read(buffer);

        for (int i = count - 1; i >= 0; i--)
            fileOutputStream.write(buffer[i]);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
