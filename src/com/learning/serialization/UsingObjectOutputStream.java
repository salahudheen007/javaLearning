package com.learning.serialization;

import java.io.*;

public class UsingObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student("salah",22,10000, "ECE", "GEW");
        FileOutputStream fout=new FileOutputStream("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\serialization\\object.txt");
        ObjectOutputStream oout=new ObjectOutputStream(fout)    ;  //used ObjectoutputStrean to write object
        oout.writeObject(student);
        oout.flush();
        fout.flush();



        FileInputStream fin=new FileInputStream("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\serialization\\object.txt");
        ObjectInputStream oin=new ObjectInputStream(fin);
        Student stu = (Student) oin.readObject();             // deserialization
        System.out.println(stu);
        oin.close();
        fin.close();
    }
}
