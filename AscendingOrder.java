package array;

import java.util.Arrays;                                         //importing array class
public class AscendingOrder {
	public static void main(String[] args) {
		int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};		// array given
		Arrays.sort(numbers);                                   // Sorting the array in ascending order
		System.out.println("Sorted Array: " + Arrays.toString(numbers));     // Printing the sorted array
	}

}



/* 
output
Sorted Array: [12, 20, 35, 45, 56, 67, 78, 78, 89]
*/














