package datastructures;

public class ValidateBinarySearchTree {

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
		TreeNode node3 = new TreeNode(10);
		TreeNode node4 = new TreeNode(1);
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

	private boolean validateTree() {
		return validateTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	private boolean validateTree(TreeNode root, int minValue, int maxValue) {
		if (root == null)
			return true;
		
		// min < root < max
		if (root.data <= minValue || root.data >= maxValue) { 
			return false;
		}
		
		boolean left = validateTree(root.left, minValue, root.data);
		if (left) {
			boolean right = validateTree(root.right, root.data, maxValue);
			return right;
		}
		return false;
	}

	public static void main(String[] args) {
		ValidateBinarySearchTree binaryTree = new ValidateBinarySearchTree();
		binaryTree.createBinaryTree();
		System.out.println("Preorder traversal");
		binaryTree.preOrderTraverse(binaryTree.root);
		System.out.println(binaryTree.validateTree());

	}

}
