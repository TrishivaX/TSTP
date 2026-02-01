package com.kavya.collections;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // **** ADD METHODS **** //
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(35);
        list.add(2, 15);
        list.offer(50);
        list.offerFirst(1);
        list.offerLast(60);


        System.out.println("After successfully adding elements using all add methods: " + list);

        // **** GET METHODS **** //

        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("Peek: " + list.peek()); // returns first ele
        System.out.println("Peek First: " + list.peekFirst()); // returns first ele
        System.out.println("Peek Last: " + list.peekLast()); //returns last ele

        // **** REMOVING ELEMENT METHODS **** //

        list.remove(); // Removes first element.
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        list.removeFirstOccurrence(20);
        list.poll();            // It removes and return first element safely.
        list.pollFirst();       // same as above.
        list.pollLast();        // Removes and return last element

        System.out.println("After removing elements: " + list);

        // **** SEARCH METHODS **** //

        System.out.println("Contains 30? " + list.contains(30));
        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // **** UPDATE METHODS **** //

        list.set(0, 99);
        System.out.println("After set(): " + list);

        // **** SIZE AND CHECK ****//

        System.out.println("Size: " + list.size());
        System.out.println("Is Empty? " + list.isEmpty());

        // **** ITERATION METHODS ****//
        System.out.println("For-each");
        for(int num:list){
            System.out.println(num+" ");
        }
        System.out.println();

        System.out.println("Using Iterator");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();

        System.out.print("ListIterator (reverse): ");
        ListIterator<Integer> lit = list.listIterator(list.size());
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // 🔹 SORT & REVERSE
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        Collections.reverse(list);
        System.out.println("After reversing: " + list);

        // 🔹 CLONE
        LinkedList<Integer> clonedList = (LinkedList<Integer>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // 🔹 CLEAR
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is Empty now? " + list.isEmpty());


    }
}
