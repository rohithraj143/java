package com.practice.regularexpressions;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountFilesInCDrive {

    private int listFiles(File dir, Pattern pattern) {
        if(dir == null){
            return 0;
        }

        int count = 0;
        File[] files = dir.listFiles();

        if(files == null) {
            return 0;
        }
        for(File f : files) {
            if(f.isDirectory()) {
                count += listFiles(f, pattern);
            }
            Matcher matcher = pattern.matcher(f.getName());
            if(matcher.find() && matcher.group().equals(f.getName())) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        File file = new File("C:\\");
        Pattern pattern = Pattern.compile("[a-zA-Z].*[.]txt");
        CountFilesInCDrive countFilesInCDrive = new CountFilesInCDrive();
        long startTime = System.currentTimeMillis();
        int total = countFilesInCDrive.listFiles(file, pattern);
        long endTime = System.currentTimeMillis();
        System.out.println("total text files are :" + total);
        System.out.println("total time took to process is " + (endTime-startTime));
        System.out.println("In minutes is " + (endTime-startTime)/60000);
    }
}
