package com.learning.Collections.comparableAndComparator;

public class Student implements Comparable{
    private String name;
    private int roolNumber;
    private int mark;
    private String dept;
    @Override
    public int compareTo(Object o) {
        Student e=(Student) o;
        return this.name.compareTo(e.name);
    }

    public Student(String name, int roolNumber, int mark, String dept) {
        this.name = name;
        this.roolNumber = roolNumber;
        this.mark = mark;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", roolNumber=" + roolNumber +
                ", mark=" + mark +
                ", dept='" + dept + '\'' +
                '}';
    }
}
