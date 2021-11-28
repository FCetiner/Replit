package c04_Method_Array;

import java.util.Arrays;

public class C04_StringiCharYapma {

	public static void main(String[] args) {
		//Create a custom return type method accepts a name as parameter and prints the name as a char array.
		//(do not use toCharArray() method)
		//Input : John
		//Output :[J, o, h, n]

		String str= "John";
	
	System.out.println(Arrays.toString(harfeCevir(str)));
	
	
	}

	private static String [] harfeCevir(String str) {
		String arr[]=str.split("");
		return arr ;
		
	}

}
