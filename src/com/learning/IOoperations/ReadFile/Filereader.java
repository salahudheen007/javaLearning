package com.learning.IOoperations.ReadFile;

import java.io.*;

public class Filereader {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\IOoperations\\scratch.txt");
        BufferedReader bf=new BufferedReader(new FileReader(file));
        String a;
        while((a=bf.readLine())!=null){
            System.out.println(a);
        }
    }

}
