package com.practice.io;

import java.io.*;

public class DataInputStreamPractice {

    public static void main(String[] args) throws IOException {

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("C:\\Code\\External_Resources\\output.txt"));
        outputStream.writeInt(100);
        outputStream.writeLong(10000);
        outputStream.writeDouble(200.2323);

        outputStream.close();
        DataInputStream inputStream = new DataInputStream(new FileInputStream("C:\\Code\\External_Resources\\output.txt"));

        int readInt = inputStream.readInt();
        long readLong = inputStream.readLong();
        double readDouble = inputStream.readDouble();

        System.out.println(readDouble);
        System.out.println(readInt);
        System.out.println(readLong);
        inputStream.close();
    }

}
