package com.learning.stringclass;

public class StringDeclaration {
    public static void main(String[] args) {
        String str1="string class";
        String str2=new String("using new keyword");
        System.out.println(str1+"\n"+str2);
        String str3=str2;
        str3=str3+"sadasd";
        System.out.println(str3+"\n"+str2);

    }
}
