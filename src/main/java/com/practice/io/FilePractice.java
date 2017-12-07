package com.practice.io;

import java.io.File;
import java.io.IOException;

public class FilePractice {


    public static void main(String[] args) {
        File file = new File("C:\\Code\\External_Resources\\input_check.txt");
        boolean newFile = false;
        try {
            newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File did not exist previously " + file.exists() + " new file " + newFile);
        System.out.println(file.length());


        File listOfFiles = new File("C:\\Code\\External_Resources");
        String[] list = listOfFiles.list();
        for(String fileName : list) {
            System.out.println(fileName);
        }
    }
}
