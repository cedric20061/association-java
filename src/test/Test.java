package test;

import models.Employee;
import models.Smartphone;

/**
 * Test of data models
 * 
 * @author Cédric GUIDI
 * @version 1.0
 */
public class Test {
	/**
	 * Main methode
	 * @param args params
	 */
    public static void main(String[] args) {
        
        // Smart phones creation
        Smartphone s1 = new Smartphone("Apple", "iPhone 14", "0611223344");
        Smartphone s2 = new Smartphone("Samsung", "Galaxy S24", "0699887766");
        Smartphone s3 = new Smartphone("Apple", "iPhone 13", "0611998877");
        
        // Employee creation
        Employee emp = new Employee("Cédric", "Guidi", 2020);
        
        // Add smart phones to emp
        emp.addSmartphone(s1);
        emp.addSmartphone(s2);
        emp.addSmartphone(s3);
        
        // Display
        emp.display();
        
        // Delete one smart phone
        System.out.println("Suppression du téléphone 0699887766...\n");
        emp.deleteSmartphoneByNumber("0699887766");
        
        // Display
        emp.display();
        
        // Count smart phone by brand
        System.out.println("Nombre de téléphones Apple : " + emp.countSmartphonesByBrand("Apple"));
    }
}
