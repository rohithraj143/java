package com.practice.multithreading;

public class SynchronizedBlockUtil {

    public static synchronized void util() {
        for(int i = 20 ; i < 40 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public synchronized void utility() {
        for(int i = 20 ; i < 40 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
