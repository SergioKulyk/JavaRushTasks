package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue blockingQueue) {
        this.queue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(queue.take());
                Thread.sleep(300);
            }
        } catch (InterruptedException ignore) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}