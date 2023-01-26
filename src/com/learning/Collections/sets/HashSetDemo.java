package com.learning.Collections.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(1);
        hs.add("sdasd");
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
