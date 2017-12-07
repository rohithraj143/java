package com.practice.multithreading;

public class MainThread {

    public static void main(String[] args) {
        ChildThreadWaitTillMainThread.mt = Thread.currentThread();

        ChildThreadWaitTillMainThread childThreadWaitTillMainThread = new ChildThreadWaitTillMainThread();
        childThreadWaitTillMainThread.start();

        for(int i = 0 ; i < 100 ; i++) {
            System.out.println("main thread");
        }
    }
}
