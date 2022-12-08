package LinkedListDsa;

public class OddNumberLinkedList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printOddNumbers(head);

    }

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printOddNumbers(Node head) {
          Node temp = head;
          while (temp != null) {
            if (temp.data % 2 != 0) {
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
