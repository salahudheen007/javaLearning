package com.learning.Collections.comparableAndComparator;

public class Students {
    private String name;
    private int roolNumber;
    private int mark;
    private String dept;

    public Students(String name, int roolNumber, int mark, String dept) {
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

    public String getName() {
        return name;
    }

    public int getRoolNumber() {
        return roolNumber;
    }

    public int getMark() {
        return mark;
    }

    public String getDept() {
        return dept;
    }
}
