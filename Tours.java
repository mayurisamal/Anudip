package demo;

class HillStations {   //Superclass
	void location() {
		System.out.println("Location details of the hill station.");
	}
	void famousFor() {
		System.out.println("Famous for scenic beauty and tourist attractions.");
	}
}
class Manali extends HillStations {      //Subclass Manali
	void location() {
		System.out.println("Manali is located in Himachal Pradesh.");
	}
	void famousFor() {
		System.out.println("Manali is famous for its scenic views and adventure activities.");
	}
}
class Mussoorie extends HillStations {    //Subclass Mussoorie
	void location() {
		System.out.println("Mussoorie is located in Uttarakhand.");
	}
	void famousFor() {
		System.out.println("Mussoorie is famous for its beautiful hill station views and colonial architecture.");
	}
}
class Gulmarg extends HillStations {  //Subclass Gulmarg
	void location() {
		System.out.println("Gulmarg is located in Jammu & Kashmir.");
	}
	void famousFor() {
		System.out.println("Gulmarg is famous for skiing and its breathtaking landscapes.");
	}
}

public class Tours {
	public static void main(String[] args) {
		// i. Call the location() and famousFor() methods via the parent class (HillStations)
		System.out.println("Calling methods via HillStations reference:");
		HillStations hillStation1 = new HillStations();
		hillStation1.location();  // Calls the parent class method
		hillStation1.famousFor(); // Calls the parent class method

		// ii. Call the location() and famousFor() methods via the subclass objects
		System.out.println("\nCalling methods via subclass objects:");
		HillStations manali = new Manali();  // Reference to HillStations, object of Manali
		manali.location();  // Calls overridden method in Manali
		manali.famousFor(); // Calls overridden method in Manali

		HillStations mussoorie = new Mussoorie();  // Reference to HillStations, object of Mussoorie
		mussoorie.location();  // Calls overridden method in Mussoorie
		mussoorie.famousFor(); // Calls overridden method in Mussoorie

		HillStations gulmarg = new Gulmarg();  // Reference to HillStations, object of Gulmarg
		gulmarg.location();  // Calls overridden method in Gulmarg
		gulmarg.famousFor(); // Calls overridden method in Gulmarg
	}
}


/*
output
Calling methods via HillStations reference:
Location details of the hill station.
Famous for scenic beauty and tourist attractions.

Calling methods via subclass objects:
Manali is located in Himachal Pradesh.
Manali is famous for its scenic views and adventure activities.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for its beautiful hill station views and colonial architecture.
Gulmarg is located in Jammu & Kashmir.
Gulmarg is famous for skiing and its breathtaking landscapes.
 */
