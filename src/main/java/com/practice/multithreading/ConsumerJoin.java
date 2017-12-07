package com.practice.multithreading;

public class ConsumerJoin extends Thread {

    private Person person;
    private ProducerJoin producerJoin;

    public ConsumerJoin(Person person, ProducerJoin producerJoin) {
        this.person = person;
        this.producerJoin = producerJoin;
    }

    public void run() {
        try {
            producerJoin.join();

            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getSalary());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
