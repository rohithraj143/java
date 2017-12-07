package com.practice.multithreading;

public class InterruptTest extends Thread {

    public void run() {
        for (int i = 0; i < 50 ; i++) {
            System.out.println("child thread till 50");
        }
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for(int i = 50; i < 100; i++) {
            System.out.println("child thread after 50");
        }
    }
}
