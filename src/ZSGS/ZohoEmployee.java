package ZSGS;

public class ZohoEmployee {
	
	private String name;
	private int id;
	
	// This variable is created only once in the memory
	// All employees will have same company
	private static String company = "Zoho corp";
	
	// This variable is declared during the first call of the class
	static int idCount = 1;
	
	public ZohoEmployee(String name) {
		this.name = name;
		this.id = idCount;
		idCount++;
	}
	
	// This static method can be called without creating a instance of the class
	public static void officeTime() {
		System.out.println("9 am to 6 pm");
	}
	
	public String toString() {
		return String.format("Name: %s; Id: %d; Company: %s", name, id, company);
	}
	
	
}
