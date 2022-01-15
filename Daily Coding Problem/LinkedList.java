public class LinkedList {
    Node head;

    // Node of simple linked list
    class Node {
        int data;
        Node next;

        public Node(int new_data) {
            this.data = new_data;
            // next remains null at init
        }
    }

    // add node at front of linked list
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // add node after given node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("Given previous node cannot be null!");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // add node at end of list
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = null;
        Node last = head; // temporarily
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    // print linked list
    public void printList(Node head_node) {
        while (head_node != null) {
            System.out.println(head_node.data + " ");
            head_node = head_node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(1);
        llist.push(2);
        llist.push(3);
        llist.append(4);
        llist.insertAfter(llist.head.next, 5);

        System.out.println("Doubly Linked List created:");
        llist.printList(llist.head);
    }
}