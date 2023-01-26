package com.learning.IOoperations.WriteFile;

import java.io.*;

public class Filewriter {
    public static void main(String[] args) throws IOException {
        File myfile=new File("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\IOoperations\\run2.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(myfile));
        String s="asdddddddddddddddddd";
        bf.write(String.valueOf(s.getBytes()));
        bf.close();
    }
}