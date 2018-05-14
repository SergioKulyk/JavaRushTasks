package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
        for (Thread thread : threads)
            thread.start();
    }

    public static class Thread1 extends Thread {
        public Thread1() {}

        public void run() { while (true) {} }
    }

    public static class Thread2 extends Thread {
        public Thread2() {}

        public void run() {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println(e.getClass().getSimpleName());
            }
        }
    }

    public static class Thread3 extends Thread {
        public Thread3() {}

        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        public Thread4() {}

        public void run() {
            showWarning();
        }

        public void showWarning() {
            if (isAlive())
                this.interrupt();
        }
    }

    public static class Thread5 extends Thread {
        public Thread5() {}

        public void run() {
            int sum = 0;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String tmp;
                while (!(tmp = reader.readLine()).equals("N")) {
                    sum += Integer.parseInt(tmp);
                }
            } catch (NumberFormatException e) {
            } catch (IOException e) {
            }
            System.out.println(sum);
        }
    }
}