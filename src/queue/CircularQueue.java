package queue;

public class CircularQueue {

	static class Queue {
		static int arr[];
		static int size;
		static int rear = -1;
		static int front = -1;

		Queue(int n) {
			arr = new int[n];
			this.size = n;
		}

		public static boolean isEmpty() {
			return rear == -1;
		}

		public static boolean isFull() {
			return (rear + 1) % size == front;
		}

		// Enqueue
		public static void add(int data) {
			if (rear == size - 1) {
				System.out.println("Queue is full!!");
				return;
			}
			if (front == -1) {
				front = 0;
			}

			rear = (rear + 1) % size;
			arr[rear] = data;

		}

		public static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int result = arr[front];

			if (rear == front) {
				rear = front = -1;
			} else {
				front = (front + 1) % size;
			}
			return result;
		}

		public static int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}

			return arr[front];
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue(4);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.remove();
		queue.add(7);


		while (!queue.isEmpty()) {
			System.out.println(queue.peek());
			queue.remove();
		}

	}

}
