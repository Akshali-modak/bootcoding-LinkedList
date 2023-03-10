package com.bootcoding.linkedlist;

public class DeleteFirstNode {
    public static void main(String[] args) {
        Node head = createDummyList();
//        lastDeleteNode(head);
//        createDummyList();
//        System.out.println("Delete Last Node");
//        printList(head);
        System.out.println("Delete First Node");
        firstDeleteNode(head);
//        printList(head);
    }
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static void firstDeleteNode(Node head){
        head = head.next;
        printList(head);
    }
//    private static void lastDeleteNode(Node head){
//        Node temp = head;
//        System.out.println("Delete Last Node :");
//        while (temp !=null){
//            System.out.println(temp.data);
//            if (temp.next.next == null){
//                temp.next = null;
//            }
//            temp = temp.next;
//        }


    public static void printList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    private static Node createDummyList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        Node head = firstNode; // 10
        head.next = secondNode; // 10 -> 20
        secondNode.next=thirdNode; // 10 -> 20 -> 30
        thirdNode.next=fourthNode; // 10 -> 20 -> 30 -> 40
        return head; // 10 (starting node)
    }



}
