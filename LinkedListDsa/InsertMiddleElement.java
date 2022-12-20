package LinkedListDsa;

public class InsertMiddleElement {
    public static void main(String[] args) {
         Node head = createLinkedList();
         insertNodeAtMidel(head);
    }
    static class Node {
        int data;
       Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     private static  void insertNodeAtMidel(Node head){
        Node temp = head;
        Node newnode = new Node(10);
        while (temp != null){
            temp = temp.next;
        }
         Node n = temp.next;
         temp.next = newnode;
         newnode.next= n;
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
