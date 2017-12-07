package com.practice.multithreading;

public class ThreadExecutorSynchronizedTest {

    public static void main(String[] args) {
        Student student = new Student();

        SynchronizationTest s1 = new SynchronizationTest("firstThread", student);
        SynchronizationTest s2 = new SynchronizationTest("secondThread", student);
        SynchronizationTest s3 = new SynchronizationTest("thirdThread", student);
        SynchronizationTest s4 = new SynchronizationTest("fourthThread", student);
        SynchronizationTest s5 = new SynchronizationTest("fifthThread", student);

        s5.setPriority(10);
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();


    }
}
