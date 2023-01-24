package binarySearchTree.easy.nodeDepths;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {

    // O(N) T
    // O(B) S

    public static int nodeDepths(BinaryTree root) {
        List<Integer> depths = new LinkedList<>();
        sumNodeDepths(root.left, depths, 0);
        sumNodeDepths(root.right, depths, 0);

        int sumOfDepths = 0;
        for (int i = 0; i < depths.size(); i++) {
            sumOfDepths += depths.get(i);
        }

        return sumOfDepths;
    }

    private static void sumNodeDepths(BinaryTree node, List<Integer> depths, int depth) {
        if (node == null) return;

        Integer currentDepth = depth + 1;
        depths.add(currentDepth);

        sumNodeDepths(node.left, depths, currentDepth);
        sumNodeDepths(node.right, depths, currentDepth);
    }



    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
