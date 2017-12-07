package com.practice.multithreading;

public class SynchronizedBlockTest extends Thread{

    private Mathematician mathematician;

    SynchronizedBlockTest(String name, Mathematician mathematician) {
        super(name);
        this.mathematician = mathematician;
    }

    public void run() {
        mathematician.math();
    }
}
