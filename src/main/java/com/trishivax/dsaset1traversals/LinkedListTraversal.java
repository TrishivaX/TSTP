package com.trishivax.dsaset1traversals;

public class LinkedListTraversal {
    static void main(String[] args) {
        Mannu1 mObj = new Mannu1();
        System.out.println(mObj.sk.s.k.deptId);


        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(head.data);

    }
}


class Node{
    int data ;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}






//Node
class Mannu1 {
    int age = 35;
    String name="kp";
    SuklaJee sk = new SuklaJee();
}

//Node
class SuklaJee{
    String mobileNo = "9999999999999999";
    String address = "Bangalore";
    Sonia s = new Sonia();
}

//Node
class Sonia{
    String course = "BE";
    String emailId = "sonia@abc.com";
    Kavya k = new Kavya();
}

//Node
class Kavya{
    String deptId = "R&D";
}