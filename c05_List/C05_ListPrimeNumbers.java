package c05_List;

import java.util.ArrayList;
import java.util.List;

public class C05_ListPrimeNumbers {

	public static void main(String[] args) {
		/*Write a program that accepts an integer as input and 
		 * prints first 10 prime numbers greater than input 
		 * Check numbers if they are even or not in a return method.
		 * Input : 5
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]*/
		int num= 5;
		List <Integer> arr = new ArrayList <> ();
	
		int count=0;
		int control=0;
		
		while (count<10) {
			num++;
			control=0;
			for (int i = 2; i < num; i++) {
				if (num%i==0) {
					control++;
					break;
				}
			}	
			if (control==0) {
				arr.add(num);
				count++;
			}
		}
		
		System.out.println(arr);
		
	}
	}
