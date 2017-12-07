package com.practice.multithreading;

public class ChildThreadWaitTillMainThread extends Thread{

    static Thread mt;

    public void run() {
        try {
            mt.join();

            for(int i = 0; i < 100; i++) {
                System.out.println("child thread");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
