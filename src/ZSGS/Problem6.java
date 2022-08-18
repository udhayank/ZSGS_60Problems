package ZSGS;

public class Problem6 {

	public static void main(String[] args) {

		int noOfStudents = 20;
		
		
		StudentsGroup group1 = new StudentsGroup("Group 1");
		StudentsGroup group2 = new StudentsGroup("Group 2");
		StudentsGroup group3 = new StudentsGroup("Group 3");
		StudentsGroup group4 = new StudentsGroup("Group 4");
		
		
//		ArrayList<Integer> allRollNos = new ArrayList<Integer>();
//		
//		for (int i=101; i <= (noOfStudents + 100); i++) {
//			allRollNos.add(i);
//		}
		
		int j=101;
		while (j <= 100 + noOfStudents) {
			group1.addRollNo(j);
			group2.addRollNo(j+1);
			group3.addRollNo(j+2);
			group4.addRollNo(j+3);
			j = j+4;
		}
		
		System.out.println(group1);
		System.out.println(group2);
		System.out.println(group3);
		System.out.println(group4);
		
	}

}
