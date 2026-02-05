package com.trishivax.javarevision;

import java.util.ArrayList;

public class CollectionTest {

    static void main(String[] args) {
        //List Set Map --> Interfaces in JAVA

        //List -> ArrayList, LinkedList
        //Set -> HashSet , TreeSet , LinkedHashSet
        //Map -> HashMap , TreeMap and LinkedHashMap

        //ArrayList --> works on the principle of Dynamic Array
        ArrayList al = new ArrayList<>();
        al.add(10000);//use to add the element in that colelction object
        System.out.println(al.toString());
        al.add(10001);
        al.add(10002);
        al.add(10003);
        al.add(10004);
        al.add(10005);
        System.out.println(al.toString());
        al.add(1, 99);
        System.out.println(al.toString());
        al.remove(1);
        System.out.println(al.toString());

    }
}
