/**
 * A unival tree (which stands for "universal value") is a tree where all nodes
 * under it have the same value.
 * 
 * Given the root to a binary tree, count the number of unival subtrees.
 */

class Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        this.data = item;
        // left and right remain null for now
    }
}

class Count {
    int count = 0;
}

class BinaryTree {
    Node root;
    Count numberOfUnivalSubtrees = new Count();

    boolean countUnivalSubtrees(Node node, Count c) {
        if (node == null) {
            return true;
        }
        boolean left = countUnivalSubtrees(node.left, c);
        boolean right = countUnivalSubtrees(node.right, c);
        if (left == false || right == false) {
            return false;
        }
        if (node.left != null && node.data != node.left.data) {
            return false;
        }
        if (node.right != null && node.data != node.right.data) {
            return false;
        }
        c.count++;
        return true;
    }

    int countUnivalSubtrees() {
        countUnivalSubtrees(root, numberOfUnivalSubtrees);
        return numberOfUnivalSubtrees.count;
    }
}

public class UnivalSubtrees {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(5);
        bt.root.left = new Node(4);
        bt.root.right = new Node(5);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(4);
        bt.root.right.right = new Node(5);
        System.out.println("Number of unival subtrees: " + bt.countUnivalSubtrees());
    }
}