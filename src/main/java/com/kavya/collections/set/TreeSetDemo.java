package com.kavya.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(30);
        ts.add(10);
        System.out.println("After adding element: "+ ts);
        System.out.println("Size of Treeset is: "+ ts.size());
        System.out.println("Contains 20: "+ts.contains(20));
        System.out.println("after remove method: "+ts.remove(10));
        System.out.println("first Element: "+ts.first());
        System.out.println("Last Element: "+ts.last());

        //Returns the greatest element that is strictly LESS THAN value
        System.out.println("Lower than 30: "+ts.lower(30));
       // Returns the smallest element that is strictly GREATER THAN value
        System.out.println("Higher than 30: "+ts.higher(30));

        //Returns the greatest element that is LESS THAN OR EQUAL TO value
        System.out.println("floor value of(25) : "+ts.floor(25));
        System.out.println("floor value of(30) : "+ts.floor(30));

        //Returns the smallest element that is GREATER THAN OR EQUAL TO value
        System.out.println("Ceiling value of(25): "+ ts.ceiling(25));

        System.out.println("PollFirst: "+ts.pollFirst());
        System.out.println("PollLast: "+ts.pollLast());
        System.out.println("After polling: "+ts);

        NavigableSet<Integer> desc = ts.descendingSet();
        System.out.println("Descending set: "+desc);

        //Returns all elements LESS THAN 30
        System.out.println("HeadSet (<30): " + ts.headSet(30));

        //Returns all elements GREATER THAN OR EQUAL TO 30
        System.out.println("TailSet (>=30): " + ts.tailSet(30));
        System.out.println("SubSet (20 to 50): " + ts.subSet(20, 50));

        TreeSet<Integer> cloned = (TreeSet<Integer>) ts.clone();
        System.out.println("Cloned TreeSet: " + cloned);

        ts.clear();
        System.out.println("After clear(): " + ts);

        System.out.println("Is TreeSet empty? " + ts.isEmpty());
    }
}
