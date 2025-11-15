package tests;

import models.Employee;
import models.Smartphone;

/**
 * Test of data models
 * 
 * @author Cédric GUIDI
 * @version 1.0
 */
public class TestCase2 {
	/**
	 * Main methode
	 * @param args params
	 */
	public static void main(String[] args) {

		// Smart phones creation
		Smartphone s1 = new Smartphone("Apple", "iPhone 14", 800, "0611223344", 2, "Black", 64, 4);
		Smartphone s2 = new Smartphone("Samsung", "Galaxy S24", 600, "0699887766", 2, "Black", 64, 4);
		Smartphone s3 = new Smartphone("Apple", "iPhone 13", 500, "0611998877", 2, "Black", 64, 4);

		// Employee creation
		Employee emp = new Employee("Cédric", "Guidi", 2020);
		// Display
		emp.display();
		
		// Add smart phones to emp
		emp.addNumericObject(s1);
		emp.addNumericObject(s2);
		emp.addNumericObject(s3);

		// Display
		emp.display();


		// Count smart phone by brand
		System.out.println("Nombre de téléphones Apple : " + emp.countDevicesByBrand("Apple"));
	}
}
