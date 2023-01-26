package com.learning.lambdaExpressions;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
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

        Collections.sort(stu,new Comparator<Students>(){

            @Override
            public int compare(Students o1, Students o2) {             // here i implemented compare method in line.
                    return o1.getName().compareTo(o2.getName());       // we can do this functional inteface
            }                                                           // here compare is unimplimented method.
        });
        stu.stream().forEach(a-> System.out.println(a));
        System.out.println("////////////////////////");
        Collections.sort(stu, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return new Integer(o1.getMark()).compareTo(new Integer(o2.getMark())) ;
            }
        });
        stu.stream().forEach(a-> System.out.println(a));
    }
}
