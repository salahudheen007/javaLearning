package com.learning.StreamClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("salah", 26, 20000);
        Employee e2 = new Employee("salih", 24, 18000);
        Employee e3 = new Employee("dabbu", 30, 40000);
        Employee e4 = new Employee("ambu", 35, 35000);
        Employee e5 = new Employee("shabeer", 23, 21000);
        Employee e6 = new Employee("lolan", 26, 28000);
        Employee e7 = new Employee("aaa", 28, 32000);
        Employee e8 = new Employee("sbbbb", 32, 10000);
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);
        arrayList.add(e6);
        arrayList.add(e7);
        arrayList.add(e8);


        List salry=arrayList.stream().filter(a -> a.getSalary() >30000).filter(a->a.getAge()>30).collect(Collectors.toList());
        salry.stream().forEach(a-> System.out.println(a));
        System.out.println("\n");
        List age=arrayList.stream().sorted((a,b)->{return new Integer(a.getAge()).compareTo(new Integer(b.getAge()));}).collect(Collectors.toList());
        age.stream().forEach(a-> System.out.println(a));
    }
}
