package demo;

public class Autoboxing {
	public static void main(String[] args) {

		// Autoboxing: converting primitive types to their respective wrapper classes

		// Primitive types
		int intVal = 10;
		double doubleVal = 20.5;
		char charVal = 'A';
		boolean boolVal = true;
		byte byteVal = 5;
		short shortVal = 15;
		long longVal = 100000000L;
		float floatVal = 10.5f;

		// Autoboxing (primitive to wrapper class)
		Integer intObj = intVal;         // int to Integer
		Double doubleObj = doubleVal;    // double to Double
		Character charObj = charVal;     // char to Character
		Boolean boolObj = boolVal;       // boolean to Boolean
		Byte byteObj = byteVal;          // byte to Byte
		Short shortObj = shortVal;       // short to Short
		Long longObj = longVal;          // long to Long
		Float floatObj = floatVal;       // float to Float

		// Output the results
		System.out.println("Autoboxing Results:");
		System.out.println("Integer: " + intObj);
		System.out.println("Double: " + doubleObj);
		System.out.println("Character: " + charObj);
		System.out.println("Boolean: " + boolObj);
		System.out.println("Byte: " + byteObj);
		System.out.println("Short: " + shortObj);
		System.out.println("Long: " + longObj);
		System.out.println("Float: " + floatObj);
	}
}


/* output
Autoboxing Results:
Integer: 10
Double: 20.5
Character: A
Boolean: true
Byte: 5
Short: 15
Long: 100000000
Float: 10.5
*/
