package com.practice.multithreading;

public class SynchronizationTest extends Thread{

    private Student student;

    public SynchronizationTest(String name, Student student) {
        super(name);
        this.student = student;
    }

    public void run() {
        student.printThreadName();
    }
}
