package models;

/**
 * Represents a tablet device extending the generic NumericObject class.
 * Includes physical dimensions and technical specifications such as
 * storage capacity and RAM.
 * 
 * @author Cédric
 * @version 2.0
 */
public class Tablet extends NumericObject {

	private double height;
	private double width;

	// New attributes
	private int storage;  // in GB
	private int ram;      // in GB

	/**
	 * Constructor of Tablet class.
	 * 
	 * @param brand     	tablet brand
	 * @param model     	tablet model
	 * @param price     	price of the tablet
	 * @param warrantyYears warranty years of the tablet
	 * @param color  		color of the tablet
	 * @param height    	physical height in centimeters
	 * @param width     	physical width in centimeters
	 * @param storage   	storage capacity in GB
	 * @param ram       	RAM in GB
	 */
	public Tablet(String brand, String model, double price,
			int warrantyYears, String color, double height, double width, int storage, int ram) {

		super(brand, model, price, warrantyYears, color);
		this.height = height;
		this.width = width;
		this.storage = storage;
		this.ram = ram;
	}

	// --- Getters ---

	public double getHeight() {
		return this.height;
	}

	public double getWidth() {
		return this.width;
	}

	public int getStorage() {
		return this.storage;
	}

	public int getRam() {
		return this.ram;
	}

	/**
	 * Displays all tablet information in a clean formatted output.
	 */
	@Override
	public void display() {
		System.out.println("---------------- TABLET ----------------");
		super.display();
		System.out.println("Dimensions     : " + this.height + " cm x " + this.width + " cm");
		System.out.println("Storage        : " + this.storage + " GB");
		System.out.println("RAM            : " + this.ram + " GB");
		System.out.println("----------------------------------------");
	}
}
