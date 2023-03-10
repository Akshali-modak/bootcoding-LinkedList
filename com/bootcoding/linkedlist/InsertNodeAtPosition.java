package com.bootcoding.linkedlist;
//Write a method to insert element in the given position (x) of a given linked list.
// If given position is 2 and linked list size is 4,
// then insert new element at second location, if given position is 4 and linked list size is 4 then
// insert element at 4th position.
public class InsertNodeAtPosition {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printDivisibleNumbers(head);
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printDivisibleNumbers(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.data % 3 == 0 || temp.data % 5 ==0) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
    private static Node createLinkedList() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }
}
