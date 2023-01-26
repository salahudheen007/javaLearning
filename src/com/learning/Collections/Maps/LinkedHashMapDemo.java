package com.learning.Collections.Maps;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put("adsfasdf",3000);
        lhm.put("Dfsd",978);
        lhm.put("asadsf",5645);
        lhm.put("ssdfsdf",74);
        Iterator it=lhm.keySet().iterator();
        while (it.hasNext()){
            System.out.println(lhm.get(it.next()));
        }
    }
}
