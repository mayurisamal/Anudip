package demo;

abstract class Vaccine {       //Abstract class Vaccine
	int age;
	String nationality;
	Vaccine(int age, String nationality) {    // Constructor to initialize age and nationality
		this.age = age;
		this.nationality = nationality;
	}
	void firstDose() {       // method for the first dose
		// Scenario 1: User can take the first dose if the user is Indian and age is 18 or above
		if ("Indian".equals(nationality) && age >= 18) {
			System.out.println("First dose given. Please pay 250 INR.");
		} else {
			System.out.println("You are not eligible for the first dose.");
		}
	}
	void secondDose() {       // method for the second dose
		// Scenario 2: User can take the second dose only after completing the first dose
		System.out.println("You are eligible to take the second dose after completing the first dose.");
	}
	abstract void boosterDose();   // Abstract method for the booster dose
}
class VaccinationSuccessful extends Vaccine {
	VaccinationSuccessful(int age, String nationality) {  // Constructor to initialize age and nationality
		super(age, nationality);
	}
	void boosterDose() {     // Implementing the abstract method boosterDose
		System.out.println("Booster dose given. Vaccination successful.");
	}
}
public class Vaccination {   //Main class Vaccination to invoke all methods
	public static void main(String[] args) {
		VaccinationSuccessful vaccination = new VaccinationSuccessful(25, "Indian"); // creating object
		// Invoke the methods
		vaccination.firstDose();      // First dose method
		vaccination.secondDose();     // Second dose method
		vaccination.boosterDose();    // Booster dose method
	}
}


/* output
First dose given. Please pay 250 INR.
You are eligible to take the second dose after completing the first dose.
Booster dose given. Vaccination successful.
 */
