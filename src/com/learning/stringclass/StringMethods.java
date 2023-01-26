package com.learning.stringclass;


public class StringMethods {
    public static void main(String[] args) {
        String str="           learning String methods         ";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.charAt(20));
        System.out.println(str.substring(20));
        System.out.println(str.substring(20,25));

        System.out.println(str.compareTo("           learning String methods         "));
        System.out.println(str.compareToIgnoreCase( "          learning String methods         "));

        System.out.println(str.concat("heloo"));
    }
}
