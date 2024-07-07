package datastructures;

public class MaxPQ {

	private Integer[] heap;
	int n;

	public MaxPQ(int capacity) {
		heap = new Integer[capacity + 1];
		n = 0;
	}

	public static void main(String[] args) {
		MaxPQ maxPq = new MaxPQ(3);
		maxPq.insert(10);
		maxPq.insert(9);
		maxPq.insert(8);
		maxPq.insert(7);

		System.out.println("Check if empty : " + maxPq.isEmpty());
		System.out.println("Size: " + maxPq.size());
		System.out.println("Heap Representation");
		maxPq.printHeap();

	}

	private void insert(int value) {
		if (n == heap.length - 1) {
			resize(2 * heap.length);
		}
		n++;
		heap[n] = value;
		swim(n);

	}

	private void swim(int k) {
		while (k > 1 && heap[k / 2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k / 2];
			heap[k / 2] = temp;
			k = k / 2;
		}

	}

	private void resize(int capacity) {
		Integer[] newArray = new Integer[capacity];
		for (int i = 0; i < heap.length; i++) {
			newArray[i] = heap[i];
		}
		heap = newArray;

	}

	private void printHeap() {
		if (!isEmpty()) {
			for (Integer value : heap) {
				System.out.print(value + " ");
			}
		} else {
			System.out.println("Heap is empty !!!");
		}
	}

	private int size() {
		return n;
	}

	private boolean isEmpty() {
		return n == 0;
	}

}
