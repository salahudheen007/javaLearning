package com.learning.IOoperations.ReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\IOoperations\\scratch.txt");
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        try {
            int data=fin.read();
            while ((data=fin.read()) != -1) {  //read return int, when ever it reach end of file read returns -1
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
