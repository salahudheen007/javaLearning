package com.learning.encapsulation;

public class Student {
    private String name;
    private int[] marks;
    private  int rollNumber;
    //here the data and the sum function are encapsulated in single class
    // fully encapsulation : variables as private , public methods to access the variables
    public Student(String name, int[] marks, int rollNumber) {
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }
    public int  getSumMark(){
        int sum=0;
        for(int i=0;i<this.marks.length;i++){
            sum+=marks[i];
        }
        return sum;
    }
}
