package binarySearchTree.medium.constructBinaryTree;

public class Solution1 {

    // O(log(n)) T
    // O(1) S

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST root = this;
            while (root != null) {
                if (value < root.value) {
                    if (root.left == null) {
                        root.left = new BST(value);
                        break;
                    }
                    root = root.left;
                } else {
                    if (root.right == null) {
                        root.right = new BST(value);
                        break;
                    }
                    root = root.right;
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST root = this;
            while (root != null) {
                if (value < root.value) {
                    root = root.left;
                } else if (value > root.value) {
                    root = root.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public BST remove(int value) {
            remove(value, this, null);
            return this;
        }

        public int getMinValue() {
            BST currentNode = this;
            while (currentNode.left != null) {
                currentNode = currentNode.left;
            }
            return currentNode.value;
        }

        public void remove(int value, BST node, BST pNode) {
            BST currentNode = node;
            BST parentNode = pNode;

            while (currentNode != null) {
                if (value < currentNode.value) {
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                } else if (value > currentNode.value) {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                } else {
                    if (currentNode.left != null && currentNode.right != null) {
                        currentNode.value = currentNode.right.getMinValue();
                        remove(currentNode.value, currentNode.right, currentNode);
                    } else if (parentNode == null) {
                        if (currentNode.left != null) {
                            currentNode.value = currentNode.left.value;
                            currentNode.right = currentNode.left.right;
                            currentNode.left = currentNode.left.left;
                        } else if (currentNode.right != null) {
                            currentNode.value = currentNode.right.value;
                            currentNode.left = currentNode.right.left;
                            currentNode.right = currentNode.right.right;
                        } else {
                            currentNode = null;
                        }
                    } else if (parentNode.left == currentNode) {
                        parentNode.left = (currentNode.left != null) ? currentNode.left : currentNode.right;
                    } else if (parentNode.right == currentNode) {
                        parentNode.right = (currentNode.left != null) ? currentNode.left : currentNode.right;
                    }
                    break;
                }
            }
        }
    }

}
