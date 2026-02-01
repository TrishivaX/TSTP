package com.kavya.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    static void main(String[] args) {
        LinkedHashSet<Integer> set  =new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);   // duplicate ignored
        set.add(null);
        System.out.println("After add(): " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("After remove(10): " + set.remove(10));

        Object[] arr = set.toArray();
        System.out.println("toArray(): ");
        for(Object o:arr){
            System.out.println(o+" ");
        }
        System.out.println();

        LinkedHashSet<Integer> clonedSet = (LinkedHashSet<Integer>) set.clone();
        System.out.println("Cloned LinkedHashSet: " + clonedSet);


        LinkedHashSet<Integer> removeSet = new LinkedHashSet<>();
        removeSet.add(20);

        set.removeAll(removeSet);
        System.out.println("After removeAll(): " + set);

        LinkedHashSet<Integer> newSet = new LinkedHashSet<>();
        newSet.add(100);
        newSet.add(200);

        set.addAll(newSet);
        System.out.println("After addAll(): " + set);


        LinkedHashSet<Integer> retainSet = new LinkedHashSet<>();
        retainSet.add(100);

        set.retainAll(retainSet);
        System.out.println("After retainAll(): " + set);

    }
}
