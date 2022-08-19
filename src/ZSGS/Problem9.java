package ZSGS;

import java.util.LinkedList;
import java.util.List;

public class Problem9 {

	public static void main(String[] args) {

		List<Integer> list1 =  List.of(2,4,5,6,7,9,10,13);
		List<Integer> list2 = List.of(2,3,4,5,6,7,8,9,11,15);
		
		List<Integer> arr1 = new LinkedList<>(list1);
		List<Integer> arr2 = new LinkedList<>(list2);
		
		List<Integer> mergedArr = new LinkedList<>();
		
		while (arr1.size() > 0 && arr2.size() > 0) {
			if (arr1.get(0) < arr2.get(0)) {
				if (!(mergedArr.contains(arr1.get(0)))) {
					mergedArr.add(arr1.remove(0));
				} else {
					arr1.remove(0);
				}
			} else {
				if (!(mergedArr.contains(arr2.get(0)))) {
					mergedArr.add(arr2.remove(0));
				} else {
					arr2.remove(0);
				}
			}
				
		}
		
		while (arr1.size() > 0) {
			if (!(mergedArr.contains(arr1.get(0)))) {
				mergedArr.add(arr1.remove(0));
			} else {
				arr1.remove(0);
			}
		}
		
		while (arr2.size() >0) {
			if (!(mergedArr.contains(arr2.get(0)))) {
				mergedArr.add(arr2.remove(0));
			} else {
				arr2.remove(0);
			}
		}
		
		System.out.println(mergedArr);

	}

}
