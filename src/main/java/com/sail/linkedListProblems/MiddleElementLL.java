package com.sail.linkedListProblems;

public class MiddleElementLL {
    public static void main(String[] args) {
        Node node = new Node(5);
        Node head = node;
        Node n1 = new Node(9);
        Node n2 = new Node(1);
        Node n3 = new Node(7);
        node.next = n1;
        n1.next = n2;
        n2.next = n3;
        Node slow = head;
        Node fast = head;

        System.out.println(head.next.data);
        while (fast != null) {
            // System.out.println(slow.data);
            if (fast.next == null) {
                System.out.println(slow.data);
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
            // slow.next = slow;
        }

        System.out.println("middle element " + slow.data);

    }
}
