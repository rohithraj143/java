package com.practice.io;

import java.io.*;

public class PipedInputAndOutputStreamPractice {

    public static void main(String[] args) throws IOException {

        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input = new PipedInputStream(output);


        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    output.write("Hello from the other side".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = input.read();
                    while(i != -1) {
                        System.out.print((char) i);
                        i = input.read();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        t1.start();
        t2.start();
    }
}
