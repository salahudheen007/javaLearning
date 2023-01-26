package com.learning.exceptions;

public class ExceptionHandle {
    public static void main(String[] args) {
        int x = 10;
        try {
            System.out.println(x / 0);   //here raise an arithamatic a=exception so we need to handle
            //we can handle by try_catch block or throws
        } catch (Exception e) {
            System.out.println("arithmatic exception found");
        }

        try {
            System.out.println(new ExceptionHandle().getResult(10,0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("programe ends here");// finally block excecure even exception occured
        }
    }
    public int getResult(int a,int b) throws ArithmeticException{  //since this method throwing exception we need handle from where it using
        return a/b;
    }
}
