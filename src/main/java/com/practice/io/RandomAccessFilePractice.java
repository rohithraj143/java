package com.practice.io;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class RandomAccessFilePractice {

    public static void main(String[] args) {

        try {
            RandomAccessFile file = new RandomAccessFile("", "rw");
            


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
