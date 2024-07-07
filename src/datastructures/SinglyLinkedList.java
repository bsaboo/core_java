package datastructures;

public class SinglyLinkedList {

	private ListNode node;
	private ListNode head;

	private static class ListNode {
		int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.head = new ListNode(10);
		ListNode second = new ListNode(6);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(100);

		singlyLinkedList.head.next = second; // 10 --> 6
		second.next = third; // 6 --> 4
		third.next = fourth;

		printSinglyLinkedList(singlyLinkedList);

		System.out.println("Length of singlylinkedlist : " + printLength(singlyLinkedList));

		ListNode newNode = new ListNode(20);
		System.out.println("New singly linkedlist with new node added at the beginning ");
		insertNewNode(singlyLinkedList, newNode);
		printSinglyLinkedList(singlyLinkedList);

		System.out.println("New singly linkedlist with new node added at the end ");
		ListNode endNode = new ListNode(13);
		insertNodeAtEnd(singlyLinkedList, endNode);
		printSinglyLinkedList(singlyLinkedList);

		int position = 2;
		System.out.println("New singly linkedlist with new node added at the position: " + position);

		ListNode node = new ListNode(45);
		insertAtPosition(singlyLinkedList, position, node);
		printSinglyLinkedList(singlyLinkedList);

		System.out.println("New singly linkedlist node when first node is deleted");
		deleteFirstNode(singlyLinkedList);
		printSinglyLinkedList(singlyLinkedList);

		System.out.println("New singly linkedlist node when last node is deleted");
		deleteLastNode(singlyLinkedList);
		printSinglyLinkedList(singlyLinkedList);

		int deletePosition = 2;
		System.out.println("New singly linkedlist with new node deleted at the position: " + deletePosition);

		deleteAtPosition(singlyLinkedList, deletePosition);
		printSinglyLinkedList(singlyLinkedList);

		int data = 45;
		System.out.println("Search element in list-- Element " + data
				+ (searchElement(singlyLinkedList, data) ? "Found" : "Not Found"));

		System.out.println("New singly linkedlist when reveresed ");
		reverseLinkedList(singlyLinkedList);
		printSinglyLinkedList(singlyLinkedList);

		System.out.println("Middle element of list: " + findMiddleElement(singlyLinkedList));

		int n = 3;
		System.out.println("Finding nth node from the list where n :" +n) ;
		int output = findElement(singlyLinkedList,n);
		System.out.println(output);
		
		int endN =7;
		System.out.println("Findling nth node from the end of the list where n :" +endN +" : "+findElementFromEnd(singlyLinkedList,endN));
				

	}

	private static int findElementFromEnd(SinglyLinkedList singlyLinkedList, int endN) {
		ListNode head = singlyLinkedList.head;
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while(count < endN) {
			if(refPtr == null) {
				throw new IllegalArgumentException("Nth end node is greater than nodes");
			}
			
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		
		return mainPtr.data;
	}

	private static int findElement(SinglyLinkedList singlyLinkedList, int n) {
		ListNode current = singlyLinkedList.head;
		int count = 1;
		while (current != null) {
			if (count == n) {
				return current.data;
			}
			current = current.next;
			count++;
		}
		return current.data;
	}

	private static int findMiddleElement(SinglyLinkedList singlyLinkedList) {
		ListNode current = singlyLinkedList.head;
		ListNode doublenode = singlyLinkedList.head;

		while (doublenode != null && doublenode.next != null) {
			current = current.next;
			doublenode = doublenode.next.next;
		}
		return current.data;
	}

	private static void reverseLinkedList(SinglyLinkedList singlyLinkedList) {
		ListNode current = singlyLinkedList.head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		singlyLinkedList.head = previous;
	}

	private static boolean searchElement(SinglyLinkedList singlyLinkedList, int data) {
		ListNode currentNode = singlyLinkedList.head;
		while (currentNode != null) {
			if (currentNode.data == data) {
				return true;
			}
			currentNode = currentNode.next;
		}

		return false;
	}

	private static void deleteAtPosition(SinglyLinkedList singlyLinkedList, int deletePosition) {
		if (deletePosition == 1) {
			singlyLinkedList.head = null;
			singlyLinkedList.head = singlyLinkedList.head.next;
		} else {
			int count = 1;
			ListNode previous = singlyLinkedList.head.next;

			while (count < deletePosition - 1) {
				previous = previous.next; // 6
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;

		}

	}

	private static void deleteLastNode(SinglyLinkedList singlyLinkedList) {

		if (singlyLinkedList.head == null || singlyLinkedList.head.next == null) {
			singlyLinkedList.head = null;
		}
		ListNode current = singlyLinkedList.head;
		ListNode previous = null;

		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
	}

	private static void deleteFirstNode(SinglyLinkedList singlyLinkedList) {

		if (singlyLinkedList.head == null) {
			singlyLinkedList.head = null;
		}

		ListNode newNode = singlyLinkedList.head.next;
		singlyLinkedList.head = null;
		singlyLinkedList.head = newNode;
	}

	private static void insertAtPosition(SinglyLinkedList singlyLinkedList, int position, ListNode newNode) {
		if (position == 1) {
			newNode.next = singlyLinkedList.head;
			singlyLinkedList.head = newNode;
		} else {
			ListNode previous = singlyLinkedList.head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
	}

	private static void insertNodeAtEnd(SinglyLinkedList singlyLinkedList, ListNode endNode) {
		ListNode current = singlyLinkedList.head;

		if (singlyLinkedList.head == null) {
			singlyLinkedList.head = current;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = endNode;

	}

	private static void insertNewNode(SinglyLinkedList singlyLinkedList, ListNode newNode) {
		newNode.next = singlyLinkedList.head;
		singlyLinkedList.head = newNode;
	}

	private static void printSinglyLinkedList(SinglyLinkedList singlyLinkedList) {
		ListNode current = singlyLinkedList.head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	private static int printLength(SinglyLinkedList singlyLinkedList) {
		int count = 0;
		ListNode current = singlyLinkedList.head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

}
