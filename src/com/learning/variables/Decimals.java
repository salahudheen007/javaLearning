package com.learning.variables;


public class Decimals {
    public static void main(String[] args) {
        double db=54.3453454543545d;
        System.out.println(String.format("%.5f",db));      // to print 5 digit after decimal
        System.out.println(String.format("%.2f",db));

        float ft=54.754f;
        System.out.println(String.format("%.10f",ft));


    }
}
