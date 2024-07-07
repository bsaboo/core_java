package datastructures;

public class BinarySearchTree {

	private TreeNode root;

	public class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}

	}

	private void insert(int value) {
		root = insert(root, value);

	}

	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	private void inOrder() {
		inOrder(root);

	}

	private void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}

	private TreeNode search(int value) {
		return search(root, value);

	}

	private TreeNode search(TreeNode root, int value) {
		if (root == null || root.data == value)
			return root;
		if (value < root.data)
			return search(root.left, value);
		else
			return search(root.right, value);

	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(8);
		tree.insert(7);
		tree.insert(6);
		tree.inOrder();

		if (null != tree.search(6))
			System.out.println("Key found.");
		else
			System.out.println("Key not found");

	}

}
