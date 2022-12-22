package com.bootcoding.linkedlist.questions;

import com.bootcoding.linkedlist.Node;

public class Concatenate {
    public static void main(String[] args) {
        Node head1 = createLinkedList();
        Node head2 = createLinkedListConcatenate();
        System.out.println(head2);
        merge(head1,head2);
        printList(head1);
    }
//    static class Node{
//        int data;
//        Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//    }

     public static void merge(Node head1 , Node head2){
        Node temp = head1;
        while(temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        temp.next = head2;
    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node createLinkedList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node forthNode = new Node(40);

        Node head1 = firstNode;
        head1.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head1;
    }
    public static Node createLinkedListConcatenate(){
        Node fifthNode = new Node(50);
        Node sixthNode = new Node(60);
        Node seventhNode = new Node(70);
        Node eightNode = new Node(80);

         Node head2 = fifthNode;
         head2.next = sixthNode;
         sixthNode.next = seventhNode;
         seventhNode.next = eightNode;
         eightNode.next =null;
         return head2;
    }
}
