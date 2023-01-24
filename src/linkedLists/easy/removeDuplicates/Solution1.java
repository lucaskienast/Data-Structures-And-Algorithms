package linkedLists.easy.removeDuplicates;

public class Solution1 {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // O(N) Time
    // O(1) Space

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList temp = linkedList;

        while(temp.next != null) {
            if (temp.value == temp.next.value)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return linkedList;
    }

}
