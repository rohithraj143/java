package com.practice.io;

import java.io.*;

public class OutputStreamPractice {

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("C:\\Code\\External_Resources\\input.txt");
            byte[] b =new byte[1024];
            int i = inputStream.read(b);

            OutputStream outputStream = new FileOutputStream("C:\\Code\\External_Resources\\output.txt");

            while(i != -1) {

                /*for(byte b1 : b) {
                    outputStream.write(b1);
                }*/
                outputStream.write(b, 0, i);

                i = inputStream.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
