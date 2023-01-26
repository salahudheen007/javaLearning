package com.learning.encapsulation;

public class TestEncapsulation {
    //wrapping up of data and method acting on the data into a same usit is called encapsulation
    public static void main(String[] args) {
        Student student=new Student("salah", new int[]{10,20,50},20);
        System.out.println(student.getSumMark());

    }
}
