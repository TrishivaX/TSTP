package com.kavya.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("After add(): "+ list);

        list.add(1,15);
        System.out.println("After adding element at index: "+ list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(3,25);
        System.out.println("after set(index): " + list);

        list.remove(3);
        System.out.println("After removing: " + list);

        System.out.println("Size of list: " + list.size());

        System.out.println("index of(40): " + list.indexOf(25));

        System.out.println("Contains (30): " + list.contains(30));

        System.out.println("Is list empty: " + list.isEmpty());

        //Iterating using for-each
        System.out.println("For-each loop");
        for(int num:list){
            System.out.println(num+" ");
        }
        System.out.println();

        //Iterating using Iterator
        System.out.println("Using Iterator");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println("After sorting: "+ list);

        Collections.reverse(list);
        System.out.println("After reversing: "+list);

        list.clear();
        System.out.println("After clear: "+list);

    }
}
