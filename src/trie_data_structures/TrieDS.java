package trie_data_structures;

public class TrieDS {

	static class Node {
		Node children[];
		boolean eow;

		Node() {
			children = new Node[26];
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
			eow = false;
		}
	}

	static Node root = new Node();

	public static void insert(String word) {
		Node currNode = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (currNode.children[index] == null) {
				currNode.children[index] = new Node();
			}
			if (i == word.length() - 1) {
				currNode.children[index].eow = true;
			}
			currNode = currNode.children[index];
		}
	}

	public static boolean search(String word) {
		Node currNode = root;

		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			Node node = currNode.children[index];
			if (node == null) {
				return false;
			}
			if (i == word.length() - 1 && node.eow == false) {
				return false;
			}
			currNode = currNode.children[index];
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = { "the", "a", "there", "their", "any" };
		for (int i = 0; i < words.length; i++) {
			insert(words[i]);
		}

		System.out.println(search("the"));
		System.out.println(search("those"));
		System.out.println(search("an"));



	}

}
