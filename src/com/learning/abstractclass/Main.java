package com.learning.abstractclass;

public class Main {
    public static void main(String[] args) {
//we cannot create object of abstarct class
// child should class should implemend the abstract methods in abstract class
        //the class containing atleast one abstract method should be abstract
    Animal animal=new Dog();
    animal.eat();
    animal.travel();
    animal=new Cat();
    animal.eat();
    animal.travel();
    }
}
