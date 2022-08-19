package ZSGS;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem9A {

	public static void main(String[] args) {
		
		// This solution is implemented using TreeSet
		
		List<Integer> list1 =  List.of(2,4,5,6,7,9,10,13);
		List<Integer> list2 = List.of(2,3,4,5,6,7,8,9,11,15);
		
		List<Integer> arr1 = new ArrayList<>(list1);
		List<Integer> arr2 = new ArrayList<>(list2);
		
		Set<Integer> mergedArr = new TreeSet<>();
		
		int i=0, j=0;
		
		while ((i < list1.size()) && (j < list2.size())) {
			if (arr1.get(i) < arr2.get(j)) {
				mergedArr.add(arr1.get(i));
				i++;
			} else {
				mergedArr.add(arr2.get(j));
				j++;
			}
		}
		
		while (i < list1.size()) {
			mergedArr.add(arr1.get(i));
			i++;
		}
		
		while (j < list2.size()) {
			mergedArr.add(arr2.get(j));
			j++;
		}
		
		System.out.println(mergedArr);

	}

}
