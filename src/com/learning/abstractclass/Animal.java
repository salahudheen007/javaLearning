package com.learning.abstractclass;

public abstract class Animal {
    public abstract void eat();
    public abstract void travel();
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("dog eat throug mouth");
    }

    @Override
    public void travel() {
        System.out.println("travel using legs");
    }
}
class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("cat eat throug mouth");

    }

    @Override
    public void travel() {
        System.out.println("travel using legs");
    }
}
