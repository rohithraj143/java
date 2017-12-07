package com.practice.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StreamTokenizerPractice {

    public static void main(String[] args) throws IOException {

        StreamTokenizer streamTokenizer = new StreamTokenizer(new FileReader("C:\\Code\\External_Resources\\input.txt"));

        while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {

            if(streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
                System.out.println(streamTokenizer.sval);
            } else if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                System.out.println(streamTokenizer.nval);
            } else if(streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
                System.out.println();
            }
        }
    }
}
