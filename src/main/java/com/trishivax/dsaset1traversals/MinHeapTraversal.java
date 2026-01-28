package com.trishivax.dsaset1traversals;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeapTraversal {
    static void main(String[] args) {
        //you can get the maximum data on top

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(55);
        maxHeap.add(5);
        maxHeap.add(50);
        maxHeap.add(550);//first data
        maxHeap.add(15);
        maxHeap.add(25);
        int size = maxHeap.size();
        for(int i=0; i<size; i++){
            System.out.println(maxHeap.poll());
        }

    }
}
