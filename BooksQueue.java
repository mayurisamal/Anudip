package collection_interfaces;

import java.util.ArrayDeque;

public class BooksQueue {

	public static void main(String[] args) {

		// Create an ArrayDeque to store book names
		ArrayDeque<String> bookQueue = new ArrayDeque<>();

		// Adding books to both ends of the deque
		bookQueue.addFirst("success of student");
		bookQueue.addFirst("Ego is the Enemy");
		bookQueue.addLast("Good things take time");
		bookQueue.addLast("Believe in yourself");

		System.out.println("Books in the queue: " + bookQueue);

		// Deleting a book from the front of the deque
		String removedFirst = bookQueue.removeFirst();
		System.out.println("Removed book from the front: " + removedFirst);

		// Deleting a book from the end of the deque
		String removedLast = bookQueue.removeLast();
		System.out.println("Removed book from the end: " + removedLast);

		// Final queue state after deletions
		System.out.println("Final books in the queue: " + bookQueue);
	}
}


/* output
Books in the queue: [Ego is the Enemy, success of student, Good things take time, Believe in yourself]
Removed book from the front: Ego is the Enemy
Removed book from the end: Believe in yourself
Final books in the queue: [success of student, Good things take time]
 */
