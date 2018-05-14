package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            int i = 1;
             while (!Thread.currentThread().isInterrupted()){
                Thread.sleep(500);
                map.put(i + "", "Some text for " + i++);
            }
        } catch (InterruptedException e) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + "thread was terminated");
        }
    }
}
