package com.learning.conditionalStatements;

public class ElseIfTest {
    public static void main(String[] args) {
        int x=10;
        if(x<5){
            System.out.println("less than 5");
        }else if(x==5){
            System.out.println("equal 5");
        }else  if(x>5 &&x<10){
            System.out.println("geater than 5");
        }else if(x>=10){
            System.out.println("out of bound");
        }
    }
}
