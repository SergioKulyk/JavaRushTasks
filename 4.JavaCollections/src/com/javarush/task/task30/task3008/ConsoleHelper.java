package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private final static String EXCEPTION_MESSAGE = "Произошла ошибка при попытке ввода текста. Попробуйте еще раз.";

    /**
     * print message
     * @param message
     */
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    /**
     *
     * @return message
     */
    public static String readString() {
        String message;
        while (true) {
            try {
                message = bufferedReader.readLine();
                return message;
            } catch (IOException e) {
                writeMessage(EXCEPTION_MESSAGE);
            }
        }
    }

    /**
     *  read
     * @return number
     */
    public static int readInt() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(readString());
                return number;
            } catch (NumberFormatException e) {
                writeMessage(EXCEPTION_MESSAGE + " И повторить ввод числа.");
            }
        }
    }
}
