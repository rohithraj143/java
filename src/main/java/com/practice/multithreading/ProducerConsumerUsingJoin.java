package com.practice.multithreading;

public class ProducerConsumerUsingJoin {

    public static void main(String[] args) {

        Person person = new Person();
        ProducerJoin producerJoin = new ProducerJoin(person);
        ConsumerJoin consumerJoin = new ConsumerJoin(person, producerJoin);

        producerJoin.start();
        consumerJoin.start();

    }
}
