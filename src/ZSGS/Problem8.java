package ZSGS;

public class Problem8 {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ZohoEmployee employee1 = new ZohoEmployee("name 1");
		ZohoEmployee employee2 = new ZohoEmployee("name 2");
		ZohoEmployee employee3 = new ZohoEmployee("name 3");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		employee1.officeTime(); // Not recommended way
		ZohoEmployee.officeTime();
		
	}

}
