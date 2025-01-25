package demo;

import java.util.Scanner;    //importing scanner class
public class Perimeter {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    // Create a Scanner object
		System.out.print("Enter the side length of the square: "); 
		double side = scanner.nextDouble();
		double perimeter = 4 * side;   // Calculate the perimeter of the square
		System.out.println("The perimeter of the square is: " + perimeter); // Display the perimeter
}
}

/* output 
Enter the side length of the square: 5
The perimeter of the square is: 20.0
 */