package c04_Method_Array;

import java.util.Scanner;

public class C03_StringiToplamaIslemi {

	public static void main(String[] args) {
		//Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
		//input : ade1r4d3
		//output : 8
		//Hint : Use Character.isDigit()  Integer.valueOf()

		Scanner scan = new Scanner(System.in);
		System.out.println("Rakam içeren bir kelime girin");
		String str = scan.nextLine();
		
		String arr []= str.split("");
		
		stringTopla(arr);
		
		
		scan.close();
	}

	private static void stringTopla(String arr[]) {
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i].charAt(0))) {
				toplam+= Integer.valueOf(arr[i]);
			}
		}
		
		System.out.println(toplam);
		
	}

}
