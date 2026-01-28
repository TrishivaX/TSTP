package com.trishivax.dsaset1traversals;

public class BSTTraversal {
    static void main(String[] args) {

        BinarySearchNode root = new BinarySearchNode(100);
        root.left = new BinarySearchNode(20);
        root.right = new BinarySearchNode(300);
        root.left.left = new BinarySearchNode(15);
        root.left.right = new BinarySearchNode(35);

        root.right.left = new BinarySearchNode(180);
        root.right.right = new BinarySearchNode(2000);

        System.out.println(root.data);

    }
}
class BinarySearchNode{
    int data;
    BinarySearchNode left;
    BinarySearchNode right;

    BinarySearchNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}