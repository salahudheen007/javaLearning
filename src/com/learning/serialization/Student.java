package com.learning.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
   transient   private int rollNumber;   // here the rollnumber will not be serialized
    private String department;
    private  String  college;
    private static final long serialVersionUID=1L;     // used to avoid exception while deserialization

    public Student(String name, int age, int rollNumber, String department, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.department = department;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", department='" + department + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
