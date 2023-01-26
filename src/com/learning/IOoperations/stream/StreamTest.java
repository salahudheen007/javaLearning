package com.learning.IOoperations.stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        StreamSearch ss = null;
        try {
            ss = new StreamSearch();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(ss.srearchById(Integer.toString(id)));
    }
}
