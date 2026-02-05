package com.trishivax.dsaset1traversals;

import java.util.Stack;

public class StackTraversal {
    static void main(String[] args) {

        //insert: push ()
        //remove : pop()
        //see the top element : peek()

        Stack s = new Stack(); //LIFO == FILO
        s.add(10);//1st position
        s.add(20);//2nd position
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        s.add(70);
        s.add(80);
        s.add(90);
        s.add(100);//10th position

        int totalSize = s.size();
        for(int i=0; i<totalSize; i++){
            //System.out.println(s.get(i));//way where we are just taking use of teh array
            // data structures concepts
            System.out.println(s.pop());
        }

        System.out.println("Post removal ::::::: "+s.size());

    }
}
