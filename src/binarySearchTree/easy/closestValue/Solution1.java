package binarySearchTree.easy.closestValue;

public class Solution1 {

    // O(log(N)) T
    // O (1) S

    public static int findClosestValueInBst(BST tree, int target) {
        int closest = 0;
        int closestDiff = Integer.MAX_VALUE;

        while(tree != null) {
            if (target == tree.value)
                return tree.value;

            int currentDiff = Math.abs(tree.value - target);
            if (currentDiff < closestDiff) {
                closestDiff = currentDiff;
                closest = tree.value;
            }

            tree = target < tree.value ? tree.left : tree.right;
        }

        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
