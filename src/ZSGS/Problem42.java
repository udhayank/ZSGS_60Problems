package ZSGS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Problem42 {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(3,5,2,7,5,4,2,3,6,7,3);
		ArrayList<Integer> arr = new ArrayList<>(list);
		
		Collections.sort(arr);
		
		// Get unique elements
		TreeSet<Integer> setOfElements = new TreeSet<>(list);
		ArrayList<Integer> elements = new ArrayList<>(setOfElements);
		
		ArrayList<Integer> countOfElements = new ArrayList<>();
		
		int current = arr.get(0);
		int count=1;
		for (int i=1; i<arr.size(); i++) {
			if (current == arr.get(i)) {
				count++;
			} else {
				countOfElements.add(count);
				current = arr.get(i);
				count = 1;
			}
		}
		countOfElements.add(count);
				
		// Print output
		for (int i=0; i<setOfElements.size(); i++) {
			System.out.println(elements.get(i) + " has occured " + countOfElements.get(i) + " times");
		}
		
	}

}
