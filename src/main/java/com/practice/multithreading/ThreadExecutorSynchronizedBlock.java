package com.practice.multithreading;

public class ThreadExecutorSynchronizedBlock {

    public static void main(String[] args) {
        Mathematician mathematician = new Mathematician();

        SynchronizedBlockTest synchronizedBlockTest = new SynchronizedBlockTest("dravid", mathematician);
        SynchronizedBlockTest synchronizedBlockTest1 = new SynchronizedBlockTest("ganguly", mathematician);
        SynchronizedBlockTest synchronizedBlockTest2 = new SynchronizedBlockTest("dhoni", mathematician);

        synchronizedBlockTest.start();
        synchronizedBlockTest1.start();
        synchronizedBlockTest2.start();

    }

}
