package tests;

import models.Employee1;
import models.Smartphone;

/**
 * Test of data models
 * 
 * @author Cédric GUIDI
 * @version 1.0
 */
public class TestCase1 {
	/**
	 * Main methode
	 * @param args params
	 */
	public static void main(String[] args) {

		// Smart phones creation
		Smartphone s1 = new Smartphone("Apple", "iPhone 14", 300, "0611223344", 2, "Black", 64, 4);

		// Employee creation
		Employee1 emp = new Employee1("Cédric", "Guidi", 2020);
		// Display
		emp.display();
		// Add smart phones to emp
		emp.setMySmartphone(s1);

		// Display
		emp.display();

	}
}
