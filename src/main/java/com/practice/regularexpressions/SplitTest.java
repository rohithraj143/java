package com.practice.regularexpressions;

import java.util.regex.Pattern;

public class SplitTest {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("[.]");
        String[] strings = p.split("www.durgasoftwaresolutions.com");

        for(String s : strings) {
            System.out.println(s);
        }
    }
}
