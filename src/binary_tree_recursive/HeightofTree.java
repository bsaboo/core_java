package binary_tree_recursive;

public class HeightofTree {
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

	public static int height(Node root) {

		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);

		int rightHeight = height(root.right);

		return Math.max(leftHeight, rightHeight) + 1;

	}

	public static void main(String[] args) {

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println("Root: " + root.data);
		System.out.println("Height of Tree :" + height(root));

	}

}
