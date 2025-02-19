package exceptionhandling;

public class ArrayIndexEx {
	public static void main(String[] args) {
		// Define an array of size 5
		int[] numbers = {10, 20, 30, 40, 50};

		try {
			// Attempting to access an index that is out of bounds
			System.out.println("Accessing element at index 10: " + numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handling the exception
			System.out.println("Error: Array index out of bounds! Please check the index.");
			System.out.println("Exception Message: " + e.getMessage());
		}

		// Continuing with normal program execution
		System.out.println("Program execution continues after the exception handling.");
	}
}

/* output
Error: Array index out of bounds! Please check the index.
Exception Message: Index 10 out of bounds for length 5
Program execution continues after the exception handling.
 */

