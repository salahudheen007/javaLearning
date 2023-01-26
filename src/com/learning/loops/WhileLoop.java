package com.learning.loops;

public class WhileLoop {
    public static void main(String[] args) {
        int x=10;
        String a="*";
        while (x>=0){
            System.out.println(a.repeat(x));
            x--;
        }
    }
}
