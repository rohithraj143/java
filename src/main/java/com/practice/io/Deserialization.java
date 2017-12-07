package com.practice.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Code\\External_Resources\\output.txt"))) {

            Person person = (Person)inputStream.readObject();
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getSalary());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
