package com.learning.equalsMethod;

import java.util.HashMap;

public class EqualsDemo {
    public static void main(String[] args) {
        Car c1=new Car("white",10000000);
        Car c2=new Car("black",1000000);
        Car c3=new Car("black",1000000);
        Car c4=new Car("red",10000000);
        Car c5=new Car("white",1000);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c4));
        System.out.println(c1.equals(c5));
        System.out.println(c2.equals(c3));

        HashMap hashMap=new HashMap();
        hashMap.put(c1,"a");
        hashMap.put(c2,"b");
        hashMap.put(c3,"d");
        hashMap.put(c4,"e");
        hashMap.put(c5,"f");
        // even though hashmap does not hold same key here it accept c2 and c3 if we are not overriden the hachcode method;
        // hash code for each object will be different
        //inorder to make same for same object override the Hashcode method

        System.out.println(hashMap.toString());
    }
}
