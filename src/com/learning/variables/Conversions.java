package com.learning.variables;

public class Conversions {
    public static void main(String[] args) {
         //String to int
        String str="100";
        int number=Integer.parseInt(str);
        System.out.println(number);
        int n= Integer.valueOf(str);
        System.out.println(n);
        //int to String
        n=111155;
        str=String.valueOf(n);
        System.out.println(str);
        System.out.println(Integer.toString(5555)+"   //");

        //Char to int
        char ch='A';
        int ascii=ch;
        System.out.println(ascii);
        System.out.println(Character.getNumericValue('5'));
        //int to char
        int a=80;
        System.out.println((char) a);

        int integer=10;
        double db=integer;
        float fl=integer;      //smaller to larger no problem
        long lg=integer;
        short sh=(short)integer;   //larger to smaller explicit type cast
        byte bt=(byte) integer;
    }
}
