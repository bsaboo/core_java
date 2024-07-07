package datastructures;

public class MaxInBinaryTree {

	private TreeNode root;

	public class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(7);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(8);
		root = node1;
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.left = node5;

	}

	private int findMaxValue(TreeNode root) {
		if (root == null)
			return Integer.MIN_VALUE;

		int maxValue = root.data;
		int left = findMaxValue(root.left);
		int right = findMaxValue(root.right);

		if (left > maxValue) {
			maxValue = left;
		}
		if (right > maxValue) {
			maxValue = left;
		}

		return maxValue;

	}

	public static void main(String[] args) {
		MaxInBinaryTree obj = new MaxInBinaryTree();
		obj.createBinaryTree();
		System.out.println("Max Value: " + obj.findMaxValue(obj.root));

	}

}
