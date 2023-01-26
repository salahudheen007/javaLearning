package com.learning.toStringMethod;



public class Test {
    public static void main(String[] args) {
        Person person=new Person("salah","indian",22);
        System.out.println(person);   //if we donot override toString method it will print memory address of object
       Student student=new Student("salah",22,100);
        System.out.println(student);  // it will print what we returning in toString method
    }
}
class Student{
    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}

class Person{
    private String name;
    private String nationality;
    private int age;

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }


}
