package ZSGS;

import java.util.ArrayList;

public class StudentsGroup {
	
	private String name;
	private ArrayList<Integer> rollNos = new ArrayList<>();

	public StudentsGroup(String name) {
		this.name = name;
	}
	
	public void addRollNo(int number) {
		rollNos.add(number);
	}
	
	public String toString() {
		String str = this.name + ":\n";
		for (int num:rollNos) {
			str = str + num + "\n";
		}
		return str;		
	}
	
}
