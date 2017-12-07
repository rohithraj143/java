package com.practice.multithreading;

public class ThreadConstructors extends Thread {

    public ThreadConstructors(String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello from child thread");

        for(int i = 0; i< 100; i++) {
            System.out.print(i);
        }
    }

}
