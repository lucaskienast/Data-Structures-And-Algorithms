public class DoublyLinkedList {
    Node head;

    // Node of doubly linked list
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int new_data) {
            this.data = new_data;
            // next and prev remain as null at initialization
        }
    }

    // insert node at front of the list
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    // insert node before given node
    public void insertBefore(Node next_node, int new_data) {
        if (next_node == null) {
            System.out.println("Next node cannot be null!");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.prev = next_node.prev;
        next_node.prev = new_node;
        new_node.next = next_node;
        if (new_node.prev != null) {
            new_node.prev.next = new_node;
        } else {
            head = new_node;
        }
    }

    // insert node after given node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("Previous node cannot be null!");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.prev = prev_node;
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        if (prev_node != null) {
            new_node.next.prev = new_node;
        }
    }

    // insert node at end of the list
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        Node last = head; // temporarily
        new_node.next = null;
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        // traverse forwards through list until at last node
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }

    // print content nodes of linked list starting at given node
    public void printList(Node node) {
        Node last = null;
        System.out.println("Traversal in forward direction");
        while (node != null) {
            System.out.println(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in backward direction");
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.push(2);
        dll.push(3);
        dll.append(4);
        dll.insertAfter(dll.head.next, 5);
        dll.insertBefore(dll.head.next.next, 6);

        System.out.println("Doubly Linked List created:");
        dll.printList(dll.head);
    }

}