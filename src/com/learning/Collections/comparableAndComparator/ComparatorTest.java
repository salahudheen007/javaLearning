package com.learning.Collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args) {
        Students s1=new Students("salah",33,99,"ECE");
        Students s2=new Students("dabbu",35,80,"cse");
        Students s3=new Students("hisham",35,89,"cse");
        Students s4=new Students("salah",33,90,"ECE");
        Students s5=new Students("salai",33,90,"ECE");
        ArrayList<Students> stu=new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);

        Collections.sort(stu,new NameComparator());
        stu.stream().forEach(a-> System.out.println(a));
        System.out.println("////////////////////////");
        Collections.sort(stu,new MarKComparator());
        stu.stream().forEach(a-> System.out.println(a));

    }
}
