package com.learning.Collections.lists;

import com.learning.classandobject.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList();
        ArrayList<Student> students = new ArrayList<>();
        mylist.add(89);
        mylist.add(70);
        mylist.add(435);   // add() method is used for adding new elements
        mylist.add(43);
        mylist.add(4);

        Student s1 = new Student();
        students.add(s1);
        ArrayList s=new ArrayList(); // if not declared data type everithing will be stored as object
        s.add(100);
        s.add("dsfsdf");
        s.add('d');
        s.add(54.345);
        s.add(true);
        for(Object o:s){
            System.out.println(o);
        }

        System.out.println("??????????????????????????????????????????????");
        for (int i = 0; i < mylist.size(); i++) {   // size method return length of array list
            System.out.println(mylist.get(i));    //get() method return the element at specified index
        }
        System.out.println("???????????????????????????????????????????????");
        mylist.add(0, 100); // it will add element at specified index
        System.out.println(mylist.isEmpty());
        mylist.remove(3);  //remove element at index 3
        System.out.println(mylist.remove((Integer) 70));
        System.out.println(mylist.indexOf(43));
        System.out.println(mylist.contains(100));
        students.clear();
        System.out.println("?????????????????????????????");
        Iterator<Integer> it = mylist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
