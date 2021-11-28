package c04_Method_Array;

import java.util.Arrays;

public class C02_ArrayTersCevirme {

	public static void main(String[] args) {
		//Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
		//Input : Coding is greate.
		//Output : .etaerg si gnidoC

		
		String str = "Coding is greate.";
		
		String arr []= str.split("");
		System.out.println(Arrays.toString(arr)); //[C, o, d, i, n, g,  , i, s,  , g, r, e, a, t, e, .]
		
		
		
		for (int i = arr.length-1; i >=0 ; i--) {		//Ters Çevirme
			System.out.print(arr[i] );
		}
		
	}

}
