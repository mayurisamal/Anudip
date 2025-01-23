package inheritance;

class Person {        //Parent class
  String name;
  int age;
 
public Person(String name, int age) {
   this.name = name;
   this.age = age;
}

public void speak() {      // Method to speak
   System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
 }
}

class Student extends Person {    //Child class which extends parent class
    String grade;

public Student(String name, int age, String grade) {
    super(name, age);
    this.grade = grade;
 }

public void study() {    // Method to study
    System.out.println("I am studying in grade " + grade + ".");
 }
}

public class Example1 {
public static void main(String[] args) {
    Student student = new Student("Mayuri", 22, "A");    // Creating an object of the Student class
    student.speak();           // Method from the Person class
    student.study();          // Method from the Student class
 }
}


/* output
Hello, my name is Mayuri and I am 22 years old.
I am studying in grade A. 
 */

