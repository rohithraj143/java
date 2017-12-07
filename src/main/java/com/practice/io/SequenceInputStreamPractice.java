package com.practice.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamPractice {


    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("C:\\Code\\External_Resources\\input1.txt");
        InputStream inputStream1 = new FileInputStream("C:\\Code\\External_Resources\\input2.txt");

        SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream, inputStream1);
        int i = sequenceInputStream.read();

        while (i != -1) {
            System.out.print((char) i);
            i = sequenceInputStream.read();
        }

    }
}
