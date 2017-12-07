package com.practice.multithreading;

public class JoinThread1 extends Thread {

    private JoinThread2 thread2;

    public JoinThread1(JoinThread2 thread2) {
        this.thread2 = thread2;
    }

    public void run() {
        for(int i = 0; i< 100; i++) {

            System.out.println("Join Thead 1");
            if(i == 50) {
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" i value is " + i);
            }
        }
    }
}
