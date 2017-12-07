package com.practice.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterPractice {

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Code\\External_Resources\\output.txt"))) {
            bufferedWriter.write("Hello from the other side, at least i have tried");
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
