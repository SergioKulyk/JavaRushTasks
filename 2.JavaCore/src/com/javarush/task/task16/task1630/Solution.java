package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        StringBuilder fileConsist = new StringBuilder();
        File file;
        public void run() {
            try {
                BufferedReader readerFile = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                String s;
                while ((s = readerFile.readLine()) != null)
                    fileConsist.append(s + " ");
                fileConsist.deleteCharAt(fileConsist.length() - 1);
                readerFile.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            file = new File(fullFileName);
        }

        @Override
        public String getFileContent() {
            return "[" + fileConsist.toString() + "]";
        }
    }
}
