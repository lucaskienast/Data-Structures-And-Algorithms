package linkedLists.medium.doublyLinkedList;

public class Solution1 {

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        // O(1) T
        // O(1) S
        public void setHead(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                insertBefore(head, node);
            }
        }

        // O(1) T
        // O(1) S
        public void setTail(Node node) {
            if (tail == null) {
                setHead(node);
            } else {
                insertAfter(tail, node);
            }
        }

        // O(1) T
        // O(1) S
        public void insertBefore(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail)
                return;
            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if (node.prev == null)
                head = nodeToInsert;
            else
                node.prev.next = nodeToInsert;
            node.prev = nodeToInsert;
        }

        // O(1) T
        // O(1) S
        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail)
                return;
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if (node.next == null)
                tail = nodeToInsert;
            else
                node.next.prev = nodeToInsert;
            node.next = nodeToInsert;
        }

        // O(p) T
        // O(1) S
        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position == 1) {
                setHead(nodeToInsert);
                return;
            }
            Node current = head;
            int currentPosition = 1;
            while (current != null && currentPosition != position) {
                current = current.next;
                currentPosition++;
            }
            if (current != null)
                insertBefore(current, nodeToInsert);
            else
                setTail(nodeToInsert);
        }

        // O(n) T
        // O(1) S
        public void removeNodesWithValue(int value) {
            Node current = head;
            while (current != null) {
                Node nodeToRemove = current;
                current = current.next;
                if (nodeToRemove.value == value)
                    remove(nodeToRemove);
            }
        }

        // O(1) T
        // O(1) S
        public void remove(Node node) {
            if (node == head)
                head = head.next;
            if (node == tail)
                tail = tail.prev;
            if (node.prev != null)
                node.prev.next = node.next;
            if (node.next != null)
                node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }

        // O(n) T
        // O(1) S
        public boolean containsNodeWithValue(int value) {
            Node current = head;
            while (current != null && current.value != value) {
                current = current.next;
            }
            return current != null;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
