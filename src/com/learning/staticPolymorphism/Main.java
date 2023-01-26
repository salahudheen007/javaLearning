package com.learning.staticPolymorphism;
//       method overloading ::  a class having more than one method with same name,
//       but different parameter/order/type, can be different return typr
public class Main {
    public int getArea(int width, int length){
        return width*length;
    }
    public  int getArea(int radius){
        return (int) (3.14*radius*radius);
    }

    public static void main(String[] args) {
        Main main=new Main();
        System.out.println("area of circle    "+main.getArea(5));
        System.out.println("area of rectangle    "+main.getArea(5,10));
    }
}
