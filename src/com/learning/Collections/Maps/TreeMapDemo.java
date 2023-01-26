package com.learning.Collections.Maps;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put("adsfasdf",3000);
        tm.put("Dfsd",978);
        tm.put("asadsf",5645);
        tm.put("ssdfsdf",74);
        Iterator it=tm.keySet().iterator();
        while (it.hasNext()){
            System.out.println(tm.get(it.next()));
        }
    }
}
