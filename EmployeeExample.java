package demo;
import java.util.Scanner;
class Employee {
	int employeeId;
	String employeeName;
	String address;
	double salary;
	void inputDetails() {   // Method to input employee details
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		employeeId = scanner.nextInt();  // Read employee ID
		scanner.nextLine();  // Consume the newline left after nextInt()
		System.out.print("Enter Employee Name: ");
		employeeName = scanner.nextLine();  // Read employee name
		System.out.print("Enter Address: ");
		address = scanner.nextLine();  // Read employee address
		System.out.print("Enter Salary: ");
		salary = scanner.nextDouble();  // Read salary
	}


	void displayDetails() {   // Method to display employee details
		System.out.println("\nEmployee Details:");
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
	}
}

public class EmployeeExample {
	public static void main(String[] args) {
		Employee emp = new Employee();   // Create an Employee object
		emp.inputDetails();   // Input employee details
		emp.displayDetails();   // Display employee details
	}
}


/*
output
Enter Employee ID: 101
Enter Employee Name: mayuri
Enter Address: solapur
Enter Salary: 50000

Employee Details:
Employee ID: 101
Employee Name: mayuri
Address: solapur
Salary: 50000.0
 */
