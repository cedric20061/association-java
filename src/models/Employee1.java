package models;

/**
 * Employee class
 * 
 * @author Cédric GUIDI
 * @version 1.0
 */
public class Employee1 {

	private String firstName;
	private String lastName;
	private int hireYear;
	private Smartphone smartphone;

	/**
	 * Constructor  of the Employee class
	 * @param aFirstName employee first name
	 * @param aLastName employee last name
	 * @param aHireYear employee hire year
	 */	public Employee1(String aFirstName, String aLastName, int aHireYear) {
		this.firstName = aFirstName;
		this.lastName = aLastName;
		this.hireYear = aHireYear;
	}

	/**
	 * lastname's getter
	 * @return employee last name
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * firstName's getter
	 * @return employee first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * hireYear's getter
	 * @return the year employee have been hired
	 */
	public int getHireYear() {
		return this.hireYear;
	}

	/**
	 * lastName's setter
	 * @param newName the new last name
	 */
	public void setLastName(String newName) {
		this.lastName = newName;
	}

	/**
	 * Add a smart phone for an employee
	 * @param smart the smart phone to add
	 */
	public void setMySmartphone(Smartphone smart) {
		this.smartphone = smart;
	}

	/**
	 * Calculate number of years employee work
	 * @param currentYear current year
	 * @return number of years employee work
	 */
	public int calculateSeniority(int currentYear) {
		return currentYear - this.hireYear;
	}

	/**
	 * display employee informations
	 */
	public void display() {
		System.out.println("=========================================");
		System.out.println("EMPLOYEE INFORMATION");
		System.out.println("=========================================");
		System.out.println("Name        : " + this.firstName + " " + this.lastName);
		System.out.println("Hire Year   : " + this.hireYear);
		System.out.println("Seniority   : " + calculateSeniority(2025) + " years");
		System.out.println("-----------------------------------------");
		if (smartphone == null) {
			System.out.println("No smartphones assigned.");
		} else {
			System.out.println("Smartphones:");
			smartphone.display();

		}
		System.out.println("=========================================\n");
	}
}
