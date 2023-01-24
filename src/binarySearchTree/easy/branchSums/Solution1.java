package binarySearchTree.easy.branchSums;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {

    // O(N) T
    // O(N) S

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new LinkedList<>();
        sumBranch(root, 0, sums);
        return sums;
    }

    private static void sumBranch(BinaryTree node, int sum, List<Integer> sums) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            sums.add(sum+node.value);
            return;
        }

        sumBranch(node.left, sum+node.value, sums);
        sumBranch(node.right, sum+node.value, sums);
    }
}
