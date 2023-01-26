package com.learning.IOoperations.ReadFile;

import java.io.IOException;
import java.io.InputStream;

public class Inputstream {
    public static void main(String[] args) {
        InputStream is=new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        } ;
    }
}
