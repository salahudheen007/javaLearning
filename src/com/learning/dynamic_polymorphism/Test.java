package com.learning.dynamic_polymorphism;

public class Test {
    public static void main(String[] args) {
        // ability of an object variable to refer any of its child class objects is called dynamic polymorphism
        Animal animal=new Animal();
        animal.eat();  // the animal class must contain the invoking method atleast as abstract
        animal=new Dog();
        animal.eat();
        animal=new Cat();
        animal.eat();
    }
}
