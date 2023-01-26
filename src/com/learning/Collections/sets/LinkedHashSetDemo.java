package com.learning.Collections.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet set=new LinkedHashSet();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(1);
        set.add("sdasd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
