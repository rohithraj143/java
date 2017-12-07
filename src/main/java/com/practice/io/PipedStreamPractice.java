package com.practice.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static java.lang.Thread.sleep;

public class PipedStreamPractice {

    public static void main(String[] args) throws InterruptedException, IOException {

        final PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream(outputStream);

        ProducerThread producerThread = new ProducerThread(outputStream);
        ConsumerThread consumerThread = new ConsumerThread(inputStream);

        Thread t1 = new Thread(producerThread);
        Thread t2 = new Thread(consumerThread);        t1.start();
        sleep(1000);
        t2.start();


        final PipedOutputStream outputStream1 = new PipedOutputStream();


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    outputStream1.write("Hello.. how  are you???".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        outputStream1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        Thread t4 = new Thread(new Runnable() {
            PipedInputStream inputStream1 = new PipedInputStream(outputStream1);

            @Override
            public void run() {
                try {
                    int read = inputStream1.read();
                    while (read != -1) {
                        System.out.print((char) read);
                        read = inputStream1.read();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        inputStream1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t3.start();
        sleep(1000);
        t4.start();
    }
}
