package com.learning.classandobject;

public class Student {
    private  String name ;
    private  int age;
    private int roll_number;
    private String schollname;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll_number=" + roll_number +
                ", schollname='" + schollname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getSchollname() {
        return schollname;
    }

    public void setSchollname(String schollname) {
        this.schollname = schollname;
    }
}
