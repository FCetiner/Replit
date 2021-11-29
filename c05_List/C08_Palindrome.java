package c05_List;

import java.util.Scanner;

public class C08_Palindrome {

	public static void main(String[] args) {
		/*Write a java program which accept a sentence as parameter, 
		 * than reverses sentence by using StringBuilder 
		 * and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
		 * Input :
			I love Java.
		Output:
		Reversed sentence : avaJ evol I. It is not a palindrome"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println();
		String str=scan.nextLine();
		reverse(str);
		
		scan.close();
	}

	private static void reverse(String str) {
		String arr[]=str.split("");
		String reverse = "";
		
		
		for (int i = arr.length-1; i >= 0; i--) {
			reverse+=arr[i];
		}
		if (str.toLowerCase().contains(reverse.toLowerCase())) {
			System.out.println(reverse);
			System.out.println("It is Palindrome.");
		} else {
			System.out.println(reverse);
			System.out.println("It is not a palindrome\"");
		}
		
	}

}
