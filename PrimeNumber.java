import java.util.Scanner;   // Import the Scanner class 

public class PrimeNumber {
    public String isPrime(int num) {   // Method to check if a number is prime,returns a string message 
        if (num <= 1) {
            return num + " is not a prime number."; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i < num; i++) {     // Check divisibility from 2 to num-1
            if (num % i == 0) {
                return num + " is not a prime number.";  // Returns that the number is not prime
            }
        }
        return num + " is a prime number."; // Returns that the number is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object 
        System.out.print("Enter a number: ");  // Ask the user to input a number
        int number = scanner.nextInt();
        PrimeNumber pn = new PrimeNumber();
        System.out.println(pn.isPrime(number)); 
    }
}


/*
output
Enter a number: 7
7 is a prime number.

Enter a number: 10
10 is not a prime number.
*/
