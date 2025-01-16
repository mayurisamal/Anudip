import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");  // for taking Input age of the candidate
        int age = scanner.nextInt();

        
        if (age >= 18) {    // Checks whether candidate is eligible for voting or not
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
            System.out.println("You need to wait " + (18 - age) + " more year(s) to become eligible.");
        }
    }
}


/* output
Enter your age: 22
You are eligible to vote. */