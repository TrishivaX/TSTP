package com.trishivax.dsaset1traversals;

import java.util.*;

public class QueueTraversal {


    static void main(String[] args) {

        //insert: enqueue ()
        //remove : dequeue()

        Queue s1 = new PriorityQueue();
        Queue s2 = new ArrayDeque();


        Queue s = new LinkedList(); //FIFO = LILO
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
        for (int i = 0; i < totalSize; i++) {
            System.out.println(s.remove());

        }

        System.out.println("Post removal ::::::: "+s.size());
    }
}
