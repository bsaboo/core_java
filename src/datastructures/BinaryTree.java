package datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BinaryTree {

	private TreeNode root;

	public class TreeNode {

		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		root = node1;

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;

	}

	private void preOrderTraverse(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);

	}

	private void iterativeTraversal(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data +" ");
			if (temp.left != null) {
				stack.push(temp.left);
			}
			if (temp.right != null) {
				stack.push(temp.right);
			}
		}

	}
	

	private void levelOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null)
				queue.offer(temp.left);
			if(temp.right != null)
				queue.offer(temp.right);
		}
		
		
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createBinaryTree();
		System.out.println("Preorder traversal");
		binaryTree.preOrderTraverse(binaryTree.root);

		System.out.println("\nIterative traversal");
		binaryTree.iterativeTraversal(binaryTree.root);
		
		System.out.println("\nLevel Order traversal");
		binaryTree.levelOrderTraversal(binaryTree.root);
	}


}
