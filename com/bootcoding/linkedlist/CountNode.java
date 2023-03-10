package com.bootcoding.linkedlist;

public class CountNode {
    public static void main(String[] args) {
      Node head = createLinkedList();
      printCountNodeElements(head);
    }
//    static class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
    private static void printCountNodeElements(Node head){
       Node temp = head;
       int count = 0;
       while (temp != null){
           count ++;
           temp = temp.next;
       }

        System.out.println(count);

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
