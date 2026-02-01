package com.kavya.collections.set;

import java.util.HashMap;
import java.util.HashSet;

public class HashsetDemo {
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);
        set.add(null);

        System.out.println("After add: "+set);

        System.out.println("Size: "+set.size());
        System.out.println("Contains 20? "+set.contains(20));

        set.remove(10);
        System.out.println("After remove(10): "+set);
        System.out.println("Is empty? "+set.isEmpty());

        //clone
        HashSet<Integer> cloneset = (HashSet<Integer>)set.clone();
        System.out.println("Cloned hashset: "+cloneset);

        HashSet<Integer> newset = new HashSet<>();
        newset.add(15);
        newset.add(25);

        set.addAll(newset);
        System.out.println("After addALl: "+set);

        // 1retainAll() (intersection)
        HashSet<Integer> retainSet = new HashSet<>();
        retainSet.add(20);
        retainSet.add(40);

        set.retainAll(retainSet); //It only gives the common elements from both the set
        System.out.println("After retainAll(): " + set);

        //removeAll()
        set.removeAll(retainSet);
        System.out.println("After removeAll(): " + set);

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // isEmpty() after clear
        System.out.println("Is empty now? " + set.isEmpty());


    }
}
