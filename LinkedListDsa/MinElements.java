package LinkedListDsa;

public class MinElements {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printMinmumElements(head);

    }
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printMinmumElements(Node head) {
        Node temp = head;//5,10,2
        int min = head.data;//5,2
        while (temp != null) {
            if (temp.data < min ) {
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.println(min);
    }
    private static Node createLinkedList() {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
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
