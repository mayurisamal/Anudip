package exceptionhandling;

public class ArithmeticExceptionEx {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;                  //ArithmeticException by dividing by zero
		} catch (ArithmeticException e) {
			// Catching the ArithmeticException
			System.out.println("Error: Arithmetic Exception occurred - " + e.getMessage());
		} finally {
			// This will always execute, whether exception occurs or not
			System.out.println("Program continues after exception handling.");
		}
	}
}


/*
Error: Arithmetic Exception occurred - / by zero
Program continues after exception handling.
*/


