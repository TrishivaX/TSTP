package com.trishivax.dsaset1traversals;

public class BinaryTreeTraversal {
    static void main(String[] args) {

        BinaryNode root = new BinaryNode(100);
        root.left = new BinaryNode(20);
        root.right = new BinaryNode(30);
        root.left.left = new BinaryNode(15);
        root.left.right = new BinaryNode(16);

        root.right.left = new BinaryNode(18);
        root.right.right = new BinaryNode(20);

        System.out.println(root.data);

    }
}
class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}