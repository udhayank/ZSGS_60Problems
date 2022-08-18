package ZSGS;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem6A {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Get inputs
		System.out.print("Enter number of students: ");
		int noOfStudents = scanner.nextInt();
		System.out.print("Enter number of groups: ");
		int noOfGroups = scanner.nextInt();
		
		// Create empty groups
		ArrayList<StudentsGroup> groups = new ArrayList<>();
		
		for (int i=1; i <= noOfGroups; i++) {
			groups.add(new StudentsGroup("Group "+i));
		}
		
		// Add roll number to groups
		int j=101;
		int groupIndex = 0;
		
		while (j <= 100 + noOfStudents) {
			if (groupIndex == noOfGroups) { // reset group index for each cycle 
				groupIndex = 0;
			}
			groups.get(groupIndex).addRollNo(j);
			j++;
			groupIndex++;			
		}
		
		// Print
		for(StudentsGroup g:groups) {
			System.out.println(g);
		}
		
		scanner.close();
		
		
	}

}
