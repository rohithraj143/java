package com.practice.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderPractice {

    public static void main(String[] args) {

        try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("C:\\Code\\External_Resources\\input.txt"))) {
            int read = lineNumberReader.read();

            while(read != -1) {
                System.out.print((char)read);
                System.out.print(lineNumberReader.getLineNumber());
                read = lineNumberReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
