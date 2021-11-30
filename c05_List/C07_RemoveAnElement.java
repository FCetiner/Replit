package c05_List;

import java.util.ArrayList;
import java.util.List;

public class C07_RemoveAnElement {

	public static void main(String[] args) {
		/* write a Java program to removes a specific element from an array and
		 *  put the remaining elements in a new array and prints the new array
		 *  Input :{1,2,3,4,5,6}
		 *  element:6
		 *  Output : [1,2,3,4,5]
		 */

		int arr1 []={1,2,3,4,5,6};
		List <Integer> arr2= new ArrayList <>();
		int element = 6;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]!=element) {
				arr2.add(arr1[i]);
			}
		}

		System.out.println(arr2.toString().replace(", ", ","));
	}

}
