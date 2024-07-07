package binary_tree_iterative;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int index = -1;

		public static Node buildTree(int nodes[]) {
			index++;
			if (nodes[index] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[index]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

	private static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {
			Node currNode = queue.remove();
			if (currNode == null) {
				System.out.println();

				if (queue.isEmpty()) {
					break;
				} else {
					queue.add(null);

				}
			} else {
				System.out.print(currNode.data + " ");
				if (currNode.left != null) {
					queue.add(currNode.left);
				}
				if (currNode.right != null) {
					queue.add(currNode.right);
				}
			}
		}

	}

	public static void main(String[] args) {

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println("Root : " +root.data);

		levelOrder(root);

	}

}
