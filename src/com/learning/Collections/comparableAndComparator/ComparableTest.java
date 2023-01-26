package com.learning.Collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        Student s1=new Student("salah",33,99,"ECE");
        Student s2=new Student("dabbu",35,80,"cse");
        Student s3=new Student("hisham",35,89,"cse");
        Student s4=new Student("salah",33,90,"ECE");
        Student s5=new Student("salai",33,90,"ECE");

        System.out.println(s1.compareTo(s2));// > 0 if the string is lexicographically greater than the other string (more characters)
        System.out.println(s1.compareTo(s4)); //0 since both name are equal
        System.out.println(s1.compareTo(s5));//<0 if the string is lexicographically less than the other string

        ArrayList<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        students.stream().forEach(a-> System.out.println(a+","));
        System.out.println("????????????????????????__________________________???????????????????????");
        Collections.sort(students);    //here sorting is done based on compareTo method in students class
        students.stream().forEach(a-> System.out.println(a+","));

    }
}
