package com.practice.multithreading;

public class JoinThread2 extends Thread{

    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println("Join Thread 2");
        }

        System.out.println("i am done");
    }
}
