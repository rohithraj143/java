package com.practice.multithreading;

public class ThreadExecutor {

    public static void main(String[] args) {

        JoinThread2 joinThread2 = new JoinThread2();
        JoinThread1 joinThread1 = new JoinThread1(joinThread2);

        joinThread1.start();
        joinThread2.start();

        for(int i =0 ;i < 100; i++) {
            System.out.println("main thread");
        }
    }
}
