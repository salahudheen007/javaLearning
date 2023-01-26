package com.learning.Collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingTest {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("salh");
        arrayList.add("salih");
        arrayList.add("dabbu");
        arrayList.add("ambu");
        Iterator it= arrayList.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" , ");
        }

        System.out.println("        /////////////////////////////////////////////////////////////");
        Collections.reverse(arrayList);   //just reverse the insertion order
        it= arrayList.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" , ");
        }

        System.out.println("////////////////////////////////////////");
        Collections.sort(arrayList);  // sort in alphabetic order
        it= arrayList.iterator();       // it works only if all elements are same type
        while (it.hasNext()){
            System.out.print(it.next()+" , ");
        }

        System.out.println("/////////////////////////////////////////////");
        Collections.sort(arrayList,Collections.reverseOrder());  // sort in  reverse alphabetic order
        arrayList.stream().forEach(System.out::println);        // it works only if all elements are same type
    }
}
