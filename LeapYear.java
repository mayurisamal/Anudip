import java.util.Scanner;  // importing Scanner class

public cclass LeapYear {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); // creating object
        System.out.print("Enter a year: "); //taking input from user
        int year = scanner.nextInt();  
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}


/* output
Enter a year: 2020
2020 is a leap year. */
