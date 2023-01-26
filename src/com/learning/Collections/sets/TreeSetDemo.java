package com.learning.Collections.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(10);
        ts.add(30);
        ts.add(1);
        ts.add(3);
        ts.add(11);
        ts.add(53);

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
