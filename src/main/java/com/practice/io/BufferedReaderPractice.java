package com.practice.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderPractice {

    public static void main(String[] args) {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Code\\External_Resources\\input.txt"));
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader("C:\\Code\\External_Resources\\input.txt"))) {
            long startTime = System.currentTimeMillis();
            int read = bufferedReader.read();

            while (read != -1) {
                System.out.print((char) read);
                read = bufferedReader.read();
            }
            long endTime = System.currentTimeMillis();
            System.out.println();
            System.out.println("processing time is " + (endTime - startTime));


            startTime = System.currentTimeMillis();
            String line = bufferedReader1.readLine();

            while(line != null) {
                System.out.print(line);
                line = bufferedReader1.readLine();
            }

            endTime = System.currentTimeMillis();
            System.out.println();
            System.out.println("processing time is " + (endTime - startTime));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
