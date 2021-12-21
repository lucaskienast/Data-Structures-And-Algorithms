/*
Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
*/

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
	protected int data;
	protected TreeNode left;
	protected TreeNode right;
	
	public TreeNode (int data) {
		this.data = data;
	}
}

public class BinaryTree {
	private TreeNode root;
	
	public static String serialize (TreeNode root) {
		if (root == null) {
			return null;
		}
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		ArrayList<String> l = new ArrayList<>();
		while (!s.isEmpty()) {
			TreeNode t = s.pop();
			if (t == null) {
				l.add("#");
			}
			else {
				l.add("" + t.data);
				s.push(t.right);
				s.push(t.left);
			}
		}
		return String.join(",", l);
	}
	
	static int t;
	
	public static TreeNode deserialize (String data) {
		if (data == null) {
			return null;
		}
		t = 0;
		String[] arr = data.split(",");
		return helper(arr);
	}
	
	public static TreeNode helper (String[] arr) {
		if (arr[t].equals("#")) {
			return null;
		}
		TreeNode root = new TreeNode(Integer.parseInt(arr[t]));
		t++;
		root.left = helper(arr);
		t++;
		root.right = helper(arr);
		return root;
	}
	
	static void inOrder (TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public static void main (String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(20);
		tree.root.left = new TreeNode(8);
		tree.root.right = new TreeNode(22);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(12);
		tree.root.left.right.left = new TreeNode(10);
		tree.root.left.right.right = new TreeNode(14);
		
		String serialized = serialize(tree.root);
		System.out.println("Serialized view of the tree:");
		System.out.println(serialized);
		System.out.println();
		
		TreeNode t = deserialize(serialized);
		System.out.println("In-order traversal of tree constructed from serialized string:");
		inOrder(t);
	}

}
