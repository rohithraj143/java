package com.practice.io;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("karthik");
        person.setAge(30);
        person.setSalary(100000);


        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Code\\External_Resources\\output.txt"));) {
            outputStream.writeObject(person);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        ; {
        }
    }
}
