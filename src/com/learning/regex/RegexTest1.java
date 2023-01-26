package com.learning.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest1 {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("salah",Pattern.CASE_INSENSITIVE);
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String data = null;
        System.out.println("enetr the line");
        try {
            data = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Matcher math= pattern.matcher(data);
        System.out.println(math.find()?"found":"not found");

    }
}
