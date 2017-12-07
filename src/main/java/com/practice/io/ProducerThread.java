package com.practice.io;

import java.io.IOException;
import java.io.PipedOutputStream;

public class ProducerThread implements Runnable {

    private PipedOutputStream pipedOutputStream;

    ProducerThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            pipedOutputStream.write("Hey man what's up!!!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pipedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public PipedOutputStream getPipedOutputStream() {
        return pipedOutputStream;
    }
}
