package com.practice.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleTest1 {

    private void checkRegex(String x) {
        Pattern p = Pattern.compile(x);
        Matcher matcher = p.matcher("a3b#k@9z");

        while(matcher.find()) {
            System.out.println(matcher.start() +" " + matcher.end() + " " + matcher.group());
        }
        System.out.println("Done");
    }

    private void checkSpace(String x) {
        System.out.println("start space");
        Pattern p = Pattern.compile(x);
        Matcher matcher = p.matcher("Hello from the other side....");

        while(matcher.find()) {
            System.out.println(matcher.start() +" " + matcher.end() + " " + matcher.group());
        }
        System.out.println("Done");
    }

    private void checkWord(String x) {
        System.out.println("start word");
        Pattern p = Pattern.compile(x);
        Matcher matcher = p.matcher("Hello345345 from44545 the34343 other side....?a");

        while(matcher.find()) {
            System.out.println(matcher.start() +" " + matcher.end() + " " + matcher.group());
        }
        System.out.println("Done");
    }

    private void checkQuantifiers(String x) {
        System.out.println("start Quantifiers");
        Pattern p = Pattern.compile(x);
        Matcher matcher = p.matcher("aaaaaaaaaaaaaaabrabakadabra wff3893821392089`1`043-53';" +
                "3983821    ]2SFDSFDSF'" +
                ";" +
                "hgfsluhiewjskgnasffs   hjegrewhjrkewnfds638743292");

        while(matcher.find()) {
            System.out.println(matcher.start() +" " + matcher.end() + " " + matcher.group());
        }
        System.out.println("Done");
    }
    public static void main(String[] args) {
        SimpleTest1 simpleTest1 = new SimpleTest1();
        simpleTest1.checkRegex("[abc]");
        simpleTest1.checkRegex("[^abc]");
        simpleTest1.checkRegex("[a-z]");
        simpleTest1.checkRegex("[a-zA-Z0-9]");
        simpleTest1.checkRegex("[^a-zA-Z0-9]");

        simpleTest1.checkSpace("\\s");
        simpleTest1.checkSpace("\\S");

        simpleTest1.checkWord("\\w");
        simpleTest1.checkWord("\\W");
        simpleTest1.checkWord(".");
        simpleTest1.checkWord("\\.");
        simpleTest1.checkWord("\\?");
        simpleTest1.checkWord("[s]");
        simpleTest1.checkWord("\n");
        simpleTest1.checkWord("a");

        simpleTest1.checkQuantifiers("a");
        simpleTest1.checkQuantifiers("\n");
        simpleTest1.checkQuantifiers("a+");
        simpleTest1.checkQuantifiers("a*");
        simpleTest1.checkQuantifiers(".*");

    }
}
