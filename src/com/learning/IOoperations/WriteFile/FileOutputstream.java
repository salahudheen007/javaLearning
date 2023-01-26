package com.learning.IOoperations.WriteFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class FileOutputstream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout=new FileOutputStream("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\IOoperations\\run.txt");
        String data="dsaaaaaaaaaaaaaaaaaaaaaaafgfdvbfsdfvgnsmdfvsndbgvsdngbdndfsdf";       //it create file run.txt at specified location if there is no file with the same name
        fout.write(data.getBytes());                                                      // if there is same file , it will overrite the file
        fout.close();
    }
}
