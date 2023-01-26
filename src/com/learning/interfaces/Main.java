package com.learning.interfaces;

public class  Main implements Sample{
    @Override
    public String eat(String a) {
        return a+"AAAAAAAAAAAAAAAAAAA";
    }

    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.eat("Sala"));
        System.out.println(Sample.x);
    }
}
