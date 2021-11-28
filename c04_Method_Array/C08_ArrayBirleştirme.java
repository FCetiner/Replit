package c04_Method_Array;

import java.util.Arrays;

public class C08_ArrayBirleþtirme {

	public static void main(String[] args) {
		// Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
		//Input1={1,2,3,4}
		//Input2={5,6}
		//Output={1,2,3,4,5,6}

		int arr1 []= {1,2,3,4};
		int arr2 [] = {5,6};
		
		
		System.out.println(Arrays.toString(birlestir(arr1,arr2)));
	}

	private static int [] birlestir(int[] arr1, int[] arr2) {
		
		int newarr []= new int [(arr1.length+arr2.length)];
		
		for (int i = 0; i < newarr.length; i++) {
			if (i<=arr1.length-1) {
				newarr[i]= arr1[i];
			} else {
				newarr[i]= arr2[i-arr1.length];		//arr2[0] olmasý için i den arr.lenght çýkardýk
			}
		}
		
		return newarr;
		
		
	}

}
