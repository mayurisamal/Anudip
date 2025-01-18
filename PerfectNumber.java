import java.util.Scanner;    //importing scanner class
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");  //takes input from user
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
           if (sum == number && number != 0) {   // Check if the sum of divisors equals the original number
            System.out.println(number + " is a perfect number.");  //Output if the number is perfect
          } 
           else {
            System.out.println(number + " is not a perfect number.");  //Output if the number is not perfect
          }
   }
}



/* output
Enter a number: 20
20 is not a perfect number.

Enter a number: 28
28 is a perfect number.
*/