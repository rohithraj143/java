package com.practice.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleTest {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("ab");
        Matcher matcher = p.matcher("abbbbababaaaababa");
        int count = 0;
        while(matcher.find()) {
            ++count;
            System.out.println(matcher.start() + " " + matcher.end() + " " + matcher.group());
        }
        System.out.println(count);
    }
}
