package binary_tree_recursive;

public class CountofNodes {
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

	public static int countNodes(Node root) {

		if (root == null) {
			return 0;
		}
		int leftNodes = countNodes(root.left);
		int rightNodes = countNodes(root.right);

		return leftNodes + rightNodes + 1;

	}

	public static void main(String[] args) {

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println("Root: " + root.data);
		System.out.println("Count of Nodes :" + countNodes(root));

	}

}
