package com.practice.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamPractice {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Code\\External_Resources\\input.txt");
        long startTime = System.currentTimeMillis();

        int read = inputStream.read();

        while (read != -1) {
            System.out.print((char) read);
            read = inputStream.read();
        }

        long endTime = System.currentTimeMillis();

        System.out.println();
        System.out.println("time is " + (endTime - startTime));
    }
}
