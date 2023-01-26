package com.learning.lambdaExpressions;

interface Talk {
    public String talking(String s);
}

public class LambdaDemo {
    public static void main(String[] args) {
        //here i am implementing the the method in above functional interface
        Talk talk = name -> "how are you " + name;  //here name is the arguments and it returning how are you+name
        //here going to use the above method
        System.out.println(talk.talking("messi"));

        Operator add = (a, b) -> {
            return a + b;
        };
        Operator substract = (a, b) -> a - b;  //since it has only return statement no need to use {} and return;
        Operator multiplier=(a,b)->a*b;
        System.out.println(add.operation(100,10));
        System.out.println(substract.operation(100,10));
        System.out.println(multiplier.operation(100,10));
    }
}

interface Operator {
    public int operation(int a, int b);
}