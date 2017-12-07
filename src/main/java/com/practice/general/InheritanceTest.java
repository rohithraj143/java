package com.practice.general;

public class InheritanceTest extends Person {

    private int weight;

    public InheritanceTest(){
        this(25);
    }

    public InheritanceTest(int weight){
        this.weight = weight;
    }


    public static void main(String[] args) {
        InheritanceTest i = new InheritanceTest(75);
        System.out.println(i.weight);

        InheritanceTest i1 = new InheritanceTest();
        System.out.println(i1.weight);
    }
}
