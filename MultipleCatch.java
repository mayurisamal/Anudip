package exceptionhandling;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int result = 10 / 0; // ArithmeticException (divide by zero)

			String str = null;
			System.out.println(str.length()); // NullPointerException 

			int[] arr = new int[5];
			arr[10] = 50; // ArrayIndexOutOfBoundsException (invalid index)

		} catch (ArithmeticException e) {
			// This block will catch the ArithmeticException
			System.out.println("Error: Arithmetic exception occurred - " + e.getMessage());
		} catch (NullPointerException e) {
			// This block will catch the NullPointerException
			System.out.println("Error: Null pointer exception occurred - " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// This block will catch the ArrayIndexOutOfBoundsException
			System.out.println("Error: Array index out of bounds exception occurred - " + e.getMessage());
		} catch (Exception e) {
			// This block will catch any other exceptions not previously caught
			System.out.println("Error: An unexpected exception occurred - " + e.getMessage());
		} finally {
			// This block will always be executed regardless of whether an exception occurs or not
			System.out.println("Finally block: This will always execute.");
		}

		System.out.println("Program continues after the try-catch block.");
	}
}

/* output
Error: Arithmetic exception occurred - / by zero
Finally block: This will always execute.
Program continues after the try-catch block.
 */
