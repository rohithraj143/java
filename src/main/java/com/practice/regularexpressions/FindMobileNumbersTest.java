package com.practice.regularexpressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMobileNumbersTest {

    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("0?([1-9]|\\s)([0-9]|\\s){(9-19)}");

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Code\\External_Resources\\mobile_numbers.txt"))) {

            String s = reader.readLine();

            while(s != null) {
                Matcher matcher = pattern.matcher(s);
                while(matcher.find()) {
                    System.out.println(matcher.group());
                }
                s = reader.readLine();
            }

    }
}
}
