package com.learning.dynamicClassLoading;

import com.learning.equalsMethod.Car;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c=Class.forName("com.learning.equalsMethod.Car");
        Car car= (Car) c.newInstance();
        System.out.println(car.getColor());
    }
}
