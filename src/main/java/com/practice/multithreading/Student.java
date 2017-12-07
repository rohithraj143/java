package com.practice.multithreading;

public class Student {

    public synchronized void printThreadName() {
        System.out.println(Thread.currentThread().getName());
    }
}
