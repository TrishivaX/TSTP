package com.trishivax.dsa;

import java.util.Stack;

public class StackTraversal {
    static void main(String[] args) {
        Stack s = new Stack();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        s.add(70);
        s.add(80);
        s.add(90);
        s.add(100);


        for(int i=0; i<10; i++){
            System.out.println(s.pop());
        }

    }
}
