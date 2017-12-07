package com.practice.multithreading;

public class Mathematician {

    public void math(){
        for(int i = 0;i < 20; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        SynchronizedBlockUtil synchronizedBlockUtil = new SynchronizedBlockUtil();
        synchronized (synchronizedBlockUtil) {
            synchronizedBlockUtil.utility();
        }
    }
}
