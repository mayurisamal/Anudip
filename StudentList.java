package collection_interfaces;

import java.util.Vector;

//Define a Student class to hold student details
class Student {
	String name;
	int age;
	String grade;

	// Constructor to initialize student details
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// Method to print student details
	public void printDetails() {
		System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
	}
}

public class StudentList {

	public static void main(String[] args) {

		// Create a Vector to hold Student objects
		Vector<Student> students = new Vector<Student>();

		// Adding students to the Vector
		students.add(new Student("ram", 20, "A"));
		students.add(new Student("sham", 22, "B"));
		students.add(new Student("tina", 21, "A"));
		students.add(new Student("meena", 23, "C"));

		// Print out details of each student using a for-each loop
		System.out.println("Student Details:");
		for (Student student : students) {
			student.printDetails();
		}
	}
}


/* output
Student Details:
Name: ram, Age: 20, Grade: A
Name: sham, Age: 22, Grade: B
Name: tina, Age: 21, Grade: A
Name: meena, Age: 23, Grade: C
 */

