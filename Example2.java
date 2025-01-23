package inheritance;

class Vehicle {    //Parent class
   String brand;
   String model;
   int year;
public Vehicle(String brand, String model, int year) {
   this.brand = brand;
   this.model = model;
   this.year = year;
 }
public void drive() {
   System.out.println("The " + brand + " " + model + " (" + year + ") is now driving.");
 }
}

class Car extends Vehicle {     //Child class: Car, which inherits from Vehicle
   String color;

public Car(String brand, String model, int year, String color) {
    super(brand, model, year);      // Calling the parent class constructor
    this.color = color;
 }

public void honk() {
    System.out.println("The " + color + " " + brand + " " + model + " is honking!");
 }
}

public class Example2 {
public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Camry", 2020, "Red");   // Creating an object of the Car class
    myCar.drive();       // Calling both the drive
    myCar.honk();       // Calling both the honk
 }
}


/* output 
The Toyota Camry (2020) is now driving.
The Red Toyota Camry is honking!
*/
