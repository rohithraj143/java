package com.practice.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamPractice {


    private static void readUsingByteArray() {
        try {
            InputStream inputStream = new FileInputStream("C:/Code/External_Resources/input.txt");
            byte[] b = new byte[1024];

            int read = inputStream.read(b);

            while (read != -1) {

                for(byte b1 : b) {
                    System.out.println("The read data is " + (char)b1);
                }

                read = inputStream.read(b);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("C:\\Code\\External_Resources\\input.txt");
            int i = inputStream.read();

            while (i != -1) {
                System.out.println("The read data is " + (char) i);
                i = inputStream.read();
            }

            System.out.println("Starting");
            readUsingByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}