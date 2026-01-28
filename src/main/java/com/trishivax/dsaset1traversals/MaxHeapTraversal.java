package com.trishivax.dsaset1traversals;

import java.util.PriorityQueue;

public class MaxHeapTraversal {
    static void main(String[] args) {
        //you can get the minimum data on top

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(55);
        minHeap.add(5);//first 5
        minHeap.add(50);
        minHeap.add(550);
        minHeap.add(15);//second 15
        minHeap.add(25);//third 25
        int size = minHeap.size();
        for(int i=0; i<size; i++){
            System.out.println(minHeap.poll());
        }



    }
}
