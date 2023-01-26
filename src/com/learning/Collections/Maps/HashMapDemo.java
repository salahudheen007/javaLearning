package com.learning.Collections.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, "salah");
        map.put(2, "aaaaaaa");
        map.put(2, "sdadfsdf");
        map.put(3, "salah");
        HashMap<String, String> s = new HashMap<>();
        s.put("a", "aaaaaaaaa");
        s.put("asdasd", "dasdfd");
        System.out.println(map.get(2));
        Set keys = map.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            System.out.println(map.get(it.next()));

        }
        Set entry=map.entrySet();
        it= entry.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }    }
}
