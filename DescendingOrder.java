package array;

import java.util.Arrays;                       // Import Arrays class for sorting functionality
public class DescendingOrder {
	public static void main(String[] args) {
		String[] array = {"A", "X", "D", "Z", "Y", "C", "W", "B"};         // Initialize array of strings
		Arrays.sort(array);       // Sort the array in ascending order
		String[] descendingArray = new String[array.length];    // Create a new array for descending order

		for (int i = 0; i < array.length; i++) {
			descendingArray[i] = array[array.length - 1 - i];  // Copy element from the end of 'array' to 'descendingArray'
		}

		System.out.println("Sorted array in descending order: ");   // Print the sorted array in descending order
		for (String str : descendingArray) {
			System.out.print(str + " ");  // Print element 
		}
	}
}


/* 
output
Sorted array in descending order: 
Z Y X W D C B A 
 */




