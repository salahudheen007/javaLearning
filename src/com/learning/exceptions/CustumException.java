package com.learning.exceptions;

public class CustumException extends Exception{
    public CustumException() {
        super("my custom exception");
    }
}
class CustomeException2 extends Throwable {
    public CustomeException2() {
        super("max mark is 100");
    }
}
