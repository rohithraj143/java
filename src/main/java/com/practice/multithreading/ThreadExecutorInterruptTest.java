package com.practice.multithreading;

public class ThreadExecutorInterruptTest {

    public static void main(String[] args) {

        InterruptTest interruptTest = new InterruptTest();
        interruptTest.start();

        interruptTest.interrupt();

        for(int i = 0 ; i  < 100; i++) {
            System.out.println("main thread");
        }


    }
}
