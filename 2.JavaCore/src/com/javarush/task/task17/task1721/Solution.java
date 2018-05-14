package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static String file1;
    public static String file2;


    static {
        File file;
        String tmpReader;

        try {
            file1 = inputFileName();
            file2 = inputFileName();

            file = new File(file1);
            BufferedReader reader = new BufferedReader(new FileReader(file.getAbsoluteFile()));

            while ((tmpReader = reader.readLine()) != null)
                allLines.add(tmpReader);

            file = new File(file2);
            reader = new BufferedReader(new FileReader(file.getAbsoluteFile()));

            while ((tmpReader = reader.readLine()) != null)
                forRemoveLines.add(tmpReader);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws CorruptedDataException{
        Solution data = new Solution();
        data.joinData();
    }

    public void joinData () throws CorruptedDataException {
        if (!allLines.containsAll(forRemoveLines)) {
            while (!allLines.isEmpty())
                allLines.remove(0);
            throw new CorruptedDataException();
        } else
            allLines.removeAll(forRemoveLines);
    }

    public static String inputFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String result = reader.readLine();
        return result;
    }
}
