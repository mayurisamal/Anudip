package demo;

public class Unboxing {
	public static void main(String[] args) {
		// Autoboxing: Converting primitive types to their wrapper class
		Integer intWrapper = Integer.valueOf(10);
		Double doubleWrapper = Double.valueOf(15.5);
		Character charWrapper = Character.valueOf('A');
		Boolean boolWrapper = Boolean.valueOf(true);
		Byte byteWrapper = Byte.valueOf((byte) 100);
		Short shortWrapper = Short.valueOf((short) 200);
		Long longWrapper = Long.valueOf(1000000L);
		Float floatWrapper = Float.valueOf(20.5f);

		// Unboxing: Converting wrapper objects back to primitive types
		int intValue = intWrapper;          // Unboxing Integer to int
		double doubleValue = doubleWrapper; // Unboxing Double to double
		char charValue = charWrapper;       // Unboxing Character to char
		boolean boolValue = boolWrapper;    // Unboxing Boolean to boolean
		byte byteValue = byteWrapper;       // Unboxing Byte to byte
		short shortValue = shortWrapper;    // Unboxing Short to short
		long longValue = longWrapper;       // Unboxing Long to long
		float floatValue = floatWrapper;    // Unboxing Float to float

		// Displaying the unboxed values
		System.out.println("Unboxed values:");
		System.out.println("int: " + intValue);
		System.out.println("double: " + doubleValue);
		System.out.println("char: " + charValue);
		System.out.println("boolean: " + boolValue);
		System.out.println("byte: " + byteValue);
		System.out.println("short: " + shortValue);
		System.out.println("long: " + longValue);
		System.out.println("float: " + floatValue);
	}
}



/* output
Unboxed values:
int: 10
double: 15.5
char: A
boolean: true
byte: 100
short: 200
long: 1000000
float: 20.5
*/
