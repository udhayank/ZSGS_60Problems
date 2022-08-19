package ZSGS;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem10 {

	public static void main(String[] args) {
		
		// Alternate sorting
		
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
		List<Integer> arr = new LinkedList<>(list);
		
		List<Integer> sortedArr = new LinkedList<>();
		
		while (arr.size() > 0) {
			sortedArr.add(Collections.max(arr));
			arr.remove(Collections.max(arr));
			
			if (arr.size() > 0) {
				sortedArr.add(Collections.min(arr));
				arr.remove(Collections.min(arr));
			}
		}
		
		System.out.println(sortedArr);

	}

}
