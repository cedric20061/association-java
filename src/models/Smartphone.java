package models;

/**
 * Smart phone class
 * 
 * @author Cédric GUIDI
 * @version 1.0
 */
public class Smartphone {
	private String brand;
	private String model;
	private String phoneNumber;
	
	/**
	 * Constructor of Smart phone class
	 * @param brand phone brand
	 * @param model phone model
	 * @param phoneNumber phone number
	 */
	public Smartphone(String brand, String model, String phoneNumber) {
		this.brand = brand;
		this.model = model;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * brand's getter
	 * @return phone brand
	 */
	public String getBrand() {
		return this.brand;
	}
	
	/**
	 * model's getter
	 * @return phone model
	 */
	public String geModel() {
		return this.model;
	}
	
	/**
	 * phone number's getter
	 * @return phone number
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	/**
	 * phone number's setter
	 * @param newPhoneNumber new phone number
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}
	
	/**
	 * phone's attributes displayer
	 */
	public void display() {
        System.out.println("    Brand       : " + this.brand);
        System.out.println("    Model       : " + this.model);
        System.out.println("    PhoneNumber : " + this.phoneNumber);
    }
}
