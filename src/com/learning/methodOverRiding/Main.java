package com.learning.methodOverRiding;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        Cat cat=new Cat();
        cat.eat();
    }
}
// a sub class has a method with same name and signature as in the super class is called method overloading
// @override  annotation used denote overrided method
// the overrided method should give equal or more visible access modifier than in tthe parent class
class Animal{
    public void eat(){
        System.out.println("animals eats through moutn");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("cat eats through mouth");
    }
}
