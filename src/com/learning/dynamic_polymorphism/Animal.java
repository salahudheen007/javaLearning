package com.learning.dynamic_polymorphism;
public class Animal {
    public void eat() {
        System.out.println("Animal eats through mouth");
    }
}


class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eats through mouth");
    }
}
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eats through mouth");
    }
}
class bird extends Animal {

}
class  Pug extends Dog {

}

