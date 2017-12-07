package com.practice.io;

import java.io.*;

public class ConsumerThread implements Runnable {

    private PipedInputStream inputStream;

    ConsumerThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {

            int read = inputStream.read();

            while(read != -1) {
                System.out.print((char) read);
                read = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
