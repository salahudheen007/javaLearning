package com.learning.exceptions;

import java.util.Scanner;

public class TestCustomeException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark<0){
            try {
                throw new CustumException();
            } catch (CustumException e) {
                e.printStackTrace();
            }
        }if(mark>100){
            try {
                throw new CustomeException2();
            } catch (CustomeException2 e) {
                e.printStackTrace();
            }

        }    }
}
