package com.learning.SingletonClass;

public class Football {
    private static Football football = new Football();

    private Football() {
    }

    public static Football getFootballInstance() {
        return football;
    }
}
