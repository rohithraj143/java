package com.practice.multithreading;

public class ProducerJoin extends Thread{

    private Person person;

    public ProducerJoin(Person person) {
        this.person = person;
    }

    public void run() {
        person.setName("karthik");
        person.setAge(28);
        person.setSalary(100000);
    }
}
