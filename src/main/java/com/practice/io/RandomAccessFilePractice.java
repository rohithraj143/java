package com.practice.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class RandomAccessFilePractice {

    public static void main(String[] args) {

        try {
            RandomAccessFile file = new RandomAccessFile("C:\\Code\\External_Resources\\input.txt", "rw");
            RandomAccessFile output = new RandomAccessFile("C:\\Code\\External_Resources\\output.txt", "rw");
            file.seek(100);
            output.seek(90);

            long filePointer = file.getFilePointer();

            System.out.println("FilePractice pointer is " + filePointer);

            int i = file.read();
            while(i != -1) {

                System.out.println((char) i);
                output.write(i);
                i = file.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
