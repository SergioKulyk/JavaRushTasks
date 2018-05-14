package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);

        ArrayList<Integer> list = new ArrayList<>();
        String s = "";

        while (fileReader.available() > 0) {

            int next = fileReader.read();
            char nextChar = (char) next;

            if ((nextChar != '\r') && (nextChar != '\n')) {
                s += nextChar;
            }
            else if (!s.equals("")) {
                int k = Integer.parseInt(s);
                if (k % 2 == 0) {
                    list.add(k);
                }
                s = "";
//                System.out.println(k);
            }
        }

        int smallest;

        for (int i = 0; i < list.size() - 1; i++) {
            smallest = i;
            for (int j = i + 1; j < list.size(); j++)
                if(list.get(j) < list.get(smallest))
                    smallest = j;
            list.add(i, list.remove(smallest));
        }

        for(int i : list)
            System.out.println(i);

        reader.close();
        fileReader.close();
    }
}
